package org.codingblocks.assignment.assignment9;

import java.util.*;

public class VerticalOrderPrintBinaryTree {
    public static void main(String[] args) {
        VerticalOrderPrintBinaryTree verticalOrderPrintBinaryTree = new VerticalOrderPrintBinaryTree();
        Node tree = verticalOrderPrintBinaryTree.createTree();
        verticalOrderPrintBinaryTree.printVerticalOrder(tree);

    }

    class Pair {
        Node node;
        int dist;

        Pair(Node node, int dist) {
            this.node = node;
            this.dist = dist;
        }

    }

    public void printVerticalOrder(Node root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        Map<Integer, List<Integer>> map = new TreeMap<>();
        while (!q.isEmpty()) {
            Pair rv = q.poll();
            int dist = rv.dist;
            Node node = rv.node;
            System.out.println(dist +" : "+node.data);
            System.out.println(map.get(dist));
            if (map.get(dist) != null) {
                map.get(dist).add(node.data);
            } else {
                map.put(dist, new ArrayList<>());
                map.get(dist).add(node.data);
            }
            if (node.left != null)
                q.add(new Pair(node.left, dist - 1));
            if (node.right != null)
                q.add(new Pair(node.right, dist + 1));
        }

        for (Integer key : map.keySet()) {
            List<Integer> ll = map.get(key);
            for (int val : ll) {
                System.out.print(val + " ");
            }
        }

    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Scanner sc = new Scanner(System.in);

//    public Node createTree() {
//        int level = sc.nextInt();
//        int e = sc.nextInt();
//        Node root = new Node(e);
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//        while (!q.isEmpty()) {
//            Node rv = q.remove();
//            int c1 = sc.nextInt();
//            Node n1 = new Node(c1);
//            rv.left = n1;
//            q.add(n1);
//
//            int c2 = sc.nextInt();
//            Node nn = new Node(c2);
//            rv.right = nn;
//            q.add(nn);
//        }
//        return root;
//    }
    public Node createTree() {
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        int e = sc.nextInt();
        Node root = new Node(e);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node rv = q.remove();
            int c1 = sc.nextInt();
            if (c1 != -1) {
                Node nn = new Node(c1);
                rv.left = nn;
                q.add(nn);
            }

            int c2 = sc.nextInt();
            if (c2 != -1) {
                Node nn = new Node(c2);
                rv.right = nn;
                q.add(nn);
            }

        }
        return root;
    }

}
