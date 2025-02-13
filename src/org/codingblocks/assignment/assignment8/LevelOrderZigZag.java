package org.codingblocks.assignment.assignment8;


import java.util.*;

public class LevelOrderZigZag {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        LevelOrderZigZag m = new LevelOrderZigZag();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderZZ() {

            // write your code here
            Deque<Node> dq = new LinkedList<>();
            dq.add(root);
            boolean leftToRight = true;
            while (!dq.isEmpty()) {
                int len = dq.size();
                for (int i = 0; i < len; i++) {
                    Node rv;
                    if (leftToRight)
                        rv = dq.pollFirst();
                    else
                        rv = dq.pollLast();
                    System.out.print(rv.data + " ");
                    if (leftToRight) {
                        if (rv.left != null) {
                            dq.addLast(rv.left);
                        }
                        if (rv.right != null) {
                            dq.addLast(rv.right);
                        }
                    } else {
                        if (rv.right != null) {
                            dq.addFirst(rv.right);
                        }
                        if (rv.left != null) {
                            dq.addFirst(rv.left);
                        }
                    }
                }
                leftToRight = !leftToRight;
            }

        }

    }

}

