package org.codingblocks.assignment.assignment8;

public class SiblingBinaryTree {
    public static void main(String[] args) {

    }

    public void sibling(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        if (root.left == null || root.right == null) {
            int val = root.left != null ? root.left.data : root.right.data;
            System.out.print(val + " ");
        }
        sibling(root.left);
        sibling(root.right);
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}
