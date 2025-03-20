package org.codingblocks.graph.sssp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * SSSP : Single Source Shortest Path
 */
public class DijkstraAlgorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public DijkstraAlgorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void Dijkstra(int src) {
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DijkstraPair(src, "" + src, 0));

        while (!pq.isEmpty()) {
            DijkstraPair rp = pq.poll();

            //2. ignore
            if (visited.contains(rp.vtx)) {
                continue;
            }
            //3. mark visited
            visited.add(rp.vtx);

            //4. self work
            System.out.println(rp);

            //5. Add unvisited neighbours
            for (int nbrs : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = map.get(rp.vtx).get(nbrs);
                    pq.add(new DijkstraPair(nbrs, rp.path + nbrs, cost));
                }
            }
        }
    }

    class DijkstraPair {
        int vtx;
        String path;
        int cost;

        public DijkstraPair(int vtx, String path, int cost) {
            this.vtx = vtx;
            this.path = path;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return vtx + " " + path + " @ " + cost;
        }
    }

}
