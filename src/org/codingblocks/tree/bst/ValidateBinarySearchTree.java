package org.codingblocks.tree.bst;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isBst;
    }
    public BstPair validBST(TreeNode root) {
        if (root == null)
            return new BstPair();
        BstPair lbp = validBST(root.left);
        BstPair rbp = validBST(root.right);
        BstPair sbp = new BstPair();
        sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
        sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
        sbp.isBst = lbp.isBst && rbp.isBst && lbp.max < root.val && rbp.min > root.val;
        return sbp;
    }
    class BstPair {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        boolean isBst = true;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
