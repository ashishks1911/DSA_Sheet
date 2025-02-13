package org.codingblocks.assignment.assignment8;

public class SumOfAllTheNodes {
    public static void main(String[] args) {

    }

    public int sumOfNodes(Node root) {
        if (root == null)
            return 0;
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.val;
    }

    static class Node {
        int val;
        Node left;
        Node right;
    }
}
