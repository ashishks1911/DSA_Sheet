package org.codingblocks.graph.mst;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public PrimsAlgorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    class PrimsPair {
        int vtx;
        int acqv;
        int cost;

        @Override
        public String toString() {
            return vtx + " " + acqv + " " + " @ " + cost;
        }

        public PrimsPair(int vtx, int acqv, int cost) {
            this.vtx = vtx;
            this.acqv = acqv;
            this.cost = cost;
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public int prims() {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimsPair(1, 1, 0));
        int sum = 0;
        while (!pq.isEmpty()) {
            PrimsPair rp = pq.peek();

            if (visited.contains(rp.vtx))
                continue;

            visited.add(rp.vtx);

            System.out.println(rp);
            sum += rp.cost;
            for (int nbrs : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.vtx, cost));
                }
            }
        }
        return sum;
    }


}
