package org.codingblocks.graph;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public GraphTraversal(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(1, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void BFT() {
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for (int key : map.keySet()) {
            if (visited.contains(key)) {
                continue;
            }
            q.add(key);
            while (!q.isEmpty()) {
                int rv = q.poll();
                if (visited.contains(rv)) {
                    continue;
                }
                visited.add(rv);
                System.out.println(rv + " ");
                for (int nbrs : map.get(key).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }

    }
}
