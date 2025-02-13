package org.codingblocks.tree.bst;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                int min = min(root.right);
                root.right = deleteNode(root.right, min);
                root.val = min;
            }
        }
        return root;
    }

    public int min(TreeNode root) {
        if (root == null)
            return Integer.MAX_VALUE;
        int l = min(root.left);
        return Math.min(root.val, l);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
