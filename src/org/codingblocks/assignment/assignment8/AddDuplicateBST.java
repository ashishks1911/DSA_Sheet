package org.codingblocks.assignment.assignment8;

/**
 * Assignment 8: https://hack.codingblocks.com/app/contests/7109
 * Topics : Binary Tree and BST
 */
public class AddDuplicateBST {
    public static void main(String[] args) {

    }

    public void duplicate(Node node) {
        if (node == null)
            return;
        duplicate(node.left);
        duplicate(node.right);
        Node newNode = new Node(node.data, node.left, null);
        node.left = newNode;
    }

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
