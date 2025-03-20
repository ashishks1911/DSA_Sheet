package org.codingblocks.graph.mst;

import org.codingblocks.map.HashMap;

/**
 * MST : Minimum Spanning Tree
 */
public class DisjointSet {
    class Node {
        int rank;
        Node parent;
        int data;
    }

    HashMap<Integer, Node> map = new HashMap<>();

    public void createSet(int v) {
        Node nn = new Node();
        nn.data = v;
        nn.rank = 0;
        nn.parent = nn;
        map.put(v, nn);
    }

    public int find(int v) {
        Node nn = map.get(v);
        return find(nn).data;
    }

    private Node find(Node nn) {
        if (nn.parent == nn)
            return nn;
//        return find(nn.parent);
        Node n = find(nn.parent);
        nn.parent = n;      // path compression
        return n;
    }

    public void union(int v1, int v2) {
        Node nn1 = map.get(v1);
        Node nn2 = map.get(v2);
        Node rn1 = find(nn1);   // representative node
        Node rn2 = find(nn2);   // representative node
        if (rn1.rank == rn2.rank) {
            rn1.parent = rn2;
            rn2.rank++;
        } else if (rn1.rank > rn2.rank) {
            rn2.parent = rn1;
        } else {
            rn1.parent = rn2;
        }
    }


}
