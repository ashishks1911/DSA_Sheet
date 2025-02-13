package org.codingblocks.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CreateTreeUsingLevelOrder {
    public Node createTree() {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        Node root = new Node(e);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node rv = q.remove();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                Node nn = new Node(c1);
                rv.left = nn;
                q.add(nn);
            }
            if (c2 != -1) {
                Node nn = new Node(c2);
                rv.right = nn;
                q.add(nn);
            }
        }
        return root;

    }

    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
}
