package org.codingblocks.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class IsBipartite {

    public boolean isBipartite(int[][] graph) {
        //BFT
        Queue<BipartitePair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            if (visited.containsKey(i)) {
                continue;
            }
            q.add(new BipartitePair(i, 0));
            while (!q.isEmpty()) {
                BipartitePair rv = q.poll();

                if (visited.containsKey(rv.vertex)) {
                    if (visited.get(rv.vertex) != rv.dist)
                        return false;
                    continue;
                }
                visited.put(rv.vertex, rv.dist);

                for (int nbrs : graph[rv.vertex]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new BipartitePair(nbrs, rv.dist + 1));
                    }
                }
            }
        }
        return true;
    }

    class BipartitePair {
        int vertex;
        int dist;

        public BipartitePair(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }
    }
}
