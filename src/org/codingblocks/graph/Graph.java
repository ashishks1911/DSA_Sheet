package org.codingblocks.graph;

import java.util.*;

/**
 * Graph : Finite set of Edge and Vertices.
 * Vertex is like node in tree. and edges are the lines which connect those vertex.
 * Application :
 * Used to maintain routing tables in routers.
 * facebook friend suggestion
 * <p>
 * Type of Graph :
 * 1. Directed graph and its types
 * a)weighted directed
 * b)un-weighted directed
 * <p>
 * 2. Undirected
 * a) undirected weighted
 * b) undirected unweighted
 */
public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public boolean containsVertex(int v1) {
        return map.containsKey(v1);
    }

    public int noOfEdges() {
        int sum = 0;
        for (int key : map.keySet()) {
            sum += map.get(key).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }

    public void removeVertex(int v) {
        for (int nbrs : map.get(v).keySet()) {
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public boolean hasPath(int src, int des, Set<Integer> visited) {
        if (src == des)
            return true;
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean res = hasPath(nbrs, des, visited);
                if (res)
                    return true;
            }
        }
        return false;
    }

    public void printAllPath(int src, int des, Set<Integer> visited, String ans) {
        if (src == des) {
            System.out.println(ans + des);
            return;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printAllPath(nbrs, des, visited, ans + src);
            }
        }
        visited.remove(src);
    }

    public boolean BFS(int src, int des) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        HashSet<Integer> visited = new HashSet<>();
        while (!q.isEmpty()) {
            //1. remove
            int rv = q.poll();

            //2. ignore
            if (visited.contains(rv)) {
                continue;
            }
            //3. add visited
            visited.add(rv);

            //4. self work
            if (rv == des)
                return true;

            //5. Add unvisited neighbours
            for (int nbrs : map.get(src).keySet()) {
                if (!visited.contains(nbrs)) {
                    q.add(nbrs);
                }
            }

        }
        return false;
    }

    public boolean DFS(int src, int des) {
        Stack<Integer> s = new Stack<>();
        s.push(src);
        HashSet<Integer> visited = new HashSet<>();
        while (!s.isEmpty()) {
            //1. remove
            int rv = s.pop();

            //2. ignore
            if (visited.contains(rv)) {
                continue;
            }
            //3. add visited
            visited.add(rv);

            //4. self work
            if (rv == des)
                return true;

            //5. Add unvisited neighbours
            for (int nbrs : map.get(src).keySet()) {
                if (!visited.contains(nbrs)) {
                    s.push(nbrs);
                }
            }

        }
        return false;
    }


}
