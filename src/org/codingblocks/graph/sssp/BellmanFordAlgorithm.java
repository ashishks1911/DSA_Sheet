package org.codingblocks.graph.sssp;

import org.codingblocks.graph.mst.KruskalAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BellmanFordAlgorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public BellmanFordAlgorithm(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void BellmanFord() {
        int v = map.size();
        int[] dist = new int[v + 1];      // for graph : 1-based indexing
        for (int i = 2; i < dist.length; i++) {
            dist[i] = 9999999;
        }
        List<EdgePair> ll = getAllEdges();

        for (int i = 1; i <= v; i++) {
            for (EdgePair e : ll) {
                if (i == v && (dist[e.e2] > dist[e.e1] + e.cost)) {
                    System.out.println(" -ve weight cycle ");
                    return;
                }
                if (dist[e.e2] > dist[e.e1] + e.cost) {
                    dist[e.e2] = dist[e.e1] + e.cost;
                }
            }
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
}
