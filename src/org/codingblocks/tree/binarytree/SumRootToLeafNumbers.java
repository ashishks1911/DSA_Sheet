package org.codingblocks.tree.binarytree;

public class SumRootToLeafNumbers {
    public static void main(String[] args) {

    }

    public int sumNumbers(TreeNode root) {
        return sumPathNumbers(root, 0);
    }

    public int sumPathNumbers(TreeNode root, int sum) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null) {
            return sum * 10 + root.val;
        }
        int l = sumPathNumbers(root.left, sum * 10 + root.val);
        int r = sumPathNumbers(root.right, sum * 10 + root.val);
        return l + r;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
