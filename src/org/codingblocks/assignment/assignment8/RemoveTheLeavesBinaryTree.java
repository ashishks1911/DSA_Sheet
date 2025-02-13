package org.codingblocks.assignment.assignment8;

public class RemoveTheLeavesBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;
    }
    public static void main(String[] args) {
        Node root = new Node();
        removeLeaves(null, root);
    }
    public static void removeLeaves(Node parent, Node child) {
        if (child == null) {
            return;
        }
        if (child.left == null && child.right == null) {
            if (parent != null) {
                if (parent.left == child) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
            return;
        }
        removeLeaves(child, child.left);
        removeLeaves(child, child.right);
    }
}
