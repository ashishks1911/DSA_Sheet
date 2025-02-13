package org.codingblocks.assignment.assignment8;

import java.util.Scanner;

public class LowestCommonAncestorBST {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            root = insert(root, k);
        }

        int p = sc.nextInt();
        int q = sc.nextInt();

        TreeNode ans = LCA(root, p, q);
        System.out.println(ans.data);

    }

    public static TreeNode LCA(TreeNode root, int p, int q) {
        while (root != null) {
            if (root.data < p && root.data < q)
                root = LCA(root.right, p, q);
            else if (root.data > p && root.data > q) {
                root = LCA(root.left, p, q);
            } else {
                return root;
            }
        }
        return null;
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        if (root.data < val)
            root.right = insert(root.right, val);
        else
            root.left = insert(root.left, val);
        return root;
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }
}