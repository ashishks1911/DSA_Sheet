package org.codingblocks.graph.mst;


import org.codingblocks.graph.mst.DisjointSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class KruskalAlgorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public KruskalAlgorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    class EdgePair {
        int e1;
        int e2;
        int cost;

        public EdgePair(int e1, int e2, int cost) {
            this.e1 = e1;
            this.e2 = e2;
            this.cost = cost;
        }
    }

    public List<EdgePair> getAllEdges() {
        List<EdgePair> ll = new ArrayList<>();
        for (int e1 : map.keySet()) {
            for (int e2 : map.get(e1).keySet()) {
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }
        return ll;
    }

    public int kruskal() {
        List<EdgePair> ll = getAllEdges();
        Collections.sort(ll, (ep1, ep2) -> ep1.cost - ep2.cost);
        int sum = 0;
        DisjointSet dsu = new DisjointSet();

        for (int v : map.keySet()) {
            dsu.createSet(v);
        }

        for (EdgePair e : ll) {
            int re1 = dsu.find(e.e1);
            int re2 = dsu.find(e.e2);
            if (re1 == re2) {
                // nothing
            } else {
                dsu.union(e.e1, e.e2);
                sum += e.cost;
                System.out.println(e);
            }
        }
        return sum;
    }

}
