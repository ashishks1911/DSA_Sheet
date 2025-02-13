package org.codingblocks.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    public BinaryTree() {
        root = createTree();
    }

    Scanner sc = new Scanner(System.in);

    //Example Tree input : 10 true 20 true 70 false false true 50 false true 80 false false
    private Node createTree() {
        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean(); //hlc : has left child
        if (hlc)
            nn.left = createTree();
        boolean hrc = sc.nextBoolean();
        if (hrc)
            nn.right = createTree();
        return nn;
    }

    public void display() {
        display(root);
    }

    private void display(Node nn) {
        if (nn == null)
            return;
        String s = "<--" + nn.val + "-->";
        if (nn.left != null)
            s = nn.left.val + s;
        else
            s = " . " + s;
        if (nn.right != null)
            s = s + nn.right.val;
        else
            s = s + " . ";
        System.out.println(s);
        display(nn.left);
        display(nn.right);
    }

    //Maximum of tree
    public int max() {
        return max(root);
    }

    private int max(Node nn) {
        if (nn == null) {
            return Integer.MIN_VALUE;
        }
        int lmax = max(nn.left);
        int rmax = max(nn.right);
        return Math.max(nn.val, Math.max(lmax, rmax));
    }

    public int height() {
        return height(root);
    }

    //Assumption : height of a single node is 0
    private int height(Node nn) {
        if (nn == null) {
            return -1;
        }
        int lh = height(nn.left);
        int rh = height(nn.right);
        return Math.max(lh, rh) + 1;
    }

    //Preorder Traversal : (root - left - right)
    public void preOrder(Node node) {
        if (node == null)
            return;
        System.out.println(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //Inorder Traversal : (left - root - right)
    public void inOrder(Node node) {
        if (node == null)
            return;
        preOrder(node.left);
        System.out.println(node.val + " ");
        preOrder(node.right);
    }

    //PostOrder Traversal : (left - right - root)
    public void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val + " ");
    }

    /**
     * Level Order
     * Algorithm :
     * For Each Node
     * 1. remove from queue
     * 2. print
     * 3. add child to queue
     */
    public void levelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node rv = q.remove();
            System.out.println(rv.val + " ");
            if (rv.left != null)
                q.add(rv.left);
            if (rv.right != null)
                q.add(rv.right);
        }
    }

}
