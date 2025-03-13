package org.codingblocks.graph;

import java.util.HashSet;

public class GraphClient {
    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 4, 5);
        g.addEdge(2, 3, 4);
        g.addEdge(3, 4, 2);
        g.addEdge(4, 5, 6);
        g.addEdge(5, 6, 1);
        g.addEdge(5, 7, 8);
        g.addEdge(6, 7, 4);

        g.display();
        g.printAllPath(1,6, new HashSet<>(), "");
    }
}
