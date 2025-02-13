package org.codingblocks.assignment.assignment8;

import java.util.*;

public class PrintAllLeafNodes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            for (String s : arr) {
                list.add(Integer.parseInt(s));
            }
        }

        TreeNode root = createTree(list);
        printLeafNodes(root);
    }

    public static void printLeafNodes(TreeNode root) {
        if (root == null)
            return;

        if (root.left == null && root.right == null)
            System.out.print(root.val + " ");

        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    public static TreeNode createTree(List<Integer> list) {
        if (list.size() == 0 || list.get(0) == -1) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(list.get(0));
        q.add(root);

        int idx = 1;
        while (!q.isEmpty() && idx < list.size()) {
            TreeNode nn = q.poll();
            // left
            if (list.get(idx) != -1) {
                nn.left = new TreeNode(list.get(idx));
                q.add(nn.left);
                idx++;
            }

            // right
            if (list.get(idx) != -1) {
                nn.right = new TreeNode(list.get(idx));
                q.add(nn.right);
                idx++;
            }
        }
        return root;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

}