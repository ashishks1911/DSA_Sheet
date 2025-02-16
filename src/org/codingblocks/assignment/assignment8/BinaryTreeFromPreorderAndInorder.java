package org.codingblocks.assignment.assignment8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeFromPreorderAndInorder {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BinaryTreeFromPreorderAndInorder m = new BinaryTreeFromPreorderAndInorder();
        int n = scn.nextInt();
        int[] pre = takeInput(n);
        int[] in = takeInput(n);
        BinaryTree bt = m.new BinaryTree(pre, in);
        bt.display();
    }

    public static int[] takeInput(int n) {

        int[] rv = new int[n];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = scn.nextInt();
        }

        return rv;
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree(int[] pre, int[] in) {
            this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
        }

        private Node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
            // write your code here
            if (phi < plo || ihi < ilo)
                return null;
            Node node = new Node();
            node.data = pre[plo];
            int idx = search(in, ilo, ihi, pre[plo]);
            int ne = idx - ilo;
            node.left = construct(pre, plo + 1, plo + ne, in, ilo, idx - 1);
            node.right = construct(pre, plo + ne + 1, phi, in, idx + 1, ihi);
            return node;

        }

        public int search(int[] inorder, int si, int ei, int item) {
            for (int i = si; i <= ei; i++) {
                if (inorder[i] == item)
                    return i;
            }
            return -1;
        }

        public void display() {
            this.display(this.root);
        }

        private void display(Node node) {
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                Node rv = q.remove();
                System.out.println(rv.data + " ");
                if (rv.left != null) {
                    q.add(rv.left);
                }
                if (rv.right != null) {
                    q.add(rv.right);
                }
            }
        }
    }
}
