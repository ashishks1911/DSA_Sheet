package org.codingblocks.assignment.assignment8;

import java.util.Scanner;

public class ReplaceWithSumOfGreaterNodes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Node root = createTree(arr, 0, arr.length - 1);
        replaceWithSum(root);
        print(root);
    }

    static int sum = 0;

    public static void replaceWithSum(Node root) {
        if (root != null) {
            replaceWithSum(root.right);
            root.data += sum;
            sum = root.data;
            replaceWithSum(root.left);
        }
    }

    public static Node createTree(int[] arr, int si, int ei) {
        if (si > ei)
            return null;
        int mid = si + (ei - si) / 2;
        Node node = new Node(arr[mid]);
        node.left = createTree(arr, si, mid - 1);
        node.right = createTree(arr, mid + 1, ei);
        return node;
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void print(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            print(root.left);
            print(root.right);
        }
    }
}
