package org.codingblocks.assignment.assignment8;

public class TreeLeftView {
    public static void main(String[] args) {

    }

    private void leftView(Node root) {
        leftSideView(root, 1);
    }

    int maxDepth = 0;

    private void leftSideView(Node root, int level) {
        if (root == null) {
            return;
        }
        if (root.data == -1) {
            return;
        }
        if (level > maxDepth) {
            System.out.print(root.data + " ");
            maxDepth = level;
        }
        leftSideView(root.left, level + 1);
        leftSideView(root.right, level + 1);
    }


    class Node {
        int data;
        Node left;
        Node right;
    }
}
