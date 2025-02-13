package org.codingblocks.assignment.assignment8;

import java.util.*;

public class ArrayListOfLevelsBinaryTree {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayListOfLevelsBinaryTree m = new ArrayListOfLevelsBinaryTree();
        BinaryTree bt1 = m.new BinaryTree();
        System.out.println(bt1.levelArrayList());
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

        public ArrayList<ArrayList<Integer>> levelArrayList() {

            // write your code here
            ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            int level = 0;
            while(!q.isEmpty()){
                int len = q.size();     //don't use q.size() directly in loop as it gets modified in the loop
                ans.add(new ArrayList<>());

                for(int i=0; i<len; i++){
                    Node rv = q.remove();
                    ans.get(level).add(rv.data);
                    if(rv.left!=null){
                        q.add(rv.left);
                    }
                    if(rv.right!=null){
                        q.add(rv.right);
                    }
                }
                level++;
            }
            return ans;

        }

    }

}

