package org.codingblocks.assignment.assignment8;

import java.util.Scanner;

public class RootToLeaf {
    public static void main(String[] args) {
        Node root = createTree();
        int k = sc.nextInt();
        rootToLeaf(root, k, "");


    }
    public static void rootToLeaf(Node root, int k, String ans){
        if (root==null)
            return;
        if (root.left==null && root.right==null){
            if (k-root.data==0)
                System.out.println(ans+root.data);
            else
                ans = "";
        }
        rootToLeaf(root.left, k- root.data, ans+root.data+" ");
        rootToLeaf(root.right, k- root.data, ans+root.data+" ");
    }
    static Scanner sc = new Scanner(System.in);
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
        }
    }

    public static Node createTree(){
        int data = sc.nextInt();
        Node node = new Node(data);
        boolean hlc = sc.nextBoolean();
        if (hlc)
            node.left = createTree();
        boolean hrc = sc.nextBoolean();
        if (hrc)
            node.right = createTree();
        return node;
    }
}
