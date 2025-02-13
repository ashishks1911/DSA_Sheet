package org.codingblocks.assignment.assignment8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RightSideView {
    public static void main(String[] args) {
        Node root = createTree();
        rightSide(root);
    }
    public static void rightSide(Node root){
        rightSideView(root, 1);
    }
    static int maxDepth =0;
    public static void rightSideView(Node root, int level){
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
        rightSideView(root.right, level + 1);
        rightSideView(root.left, level + 1);
    }

    static Scanner sc = new Scanner(System.in);
    public static Node createTree() {
        Queue<Node> q = new LinkedList<>();
        int data = sc.nextInt();
        Node root = new Node(data);
        q.add(root);

        int idx = 1;
        while (!q.isEmpty()) {
            Node nn = q.poll();
            // left
            int left = sc.nextInt();
            if (left != -1) {
                nn.left = new Node(left);
                q.add(nn.left);
                idx++;
            }

            // right
            int right = sc.nextInt();
            if (right != -1) {
                nn.right = new Node(right);
                q.add(nn.right);
                idx++;
            }
        }
        return root;
    }

    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
        }
    }
}
