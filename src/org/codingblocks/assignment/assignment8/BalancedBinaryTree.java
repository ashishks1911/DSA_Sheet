package org.codingblocks.assignment.assignment8;

public class BalancedBinaryTree {
    public BalancedPair isBalanced(Node node) {
        // write your code here
        if (node == null) {
            BalancedPair bp = new BalancedPair();
            bp.height = -1;
            bp.isBalanced = true;
            return bp;
        }
        BalancedPair lbp = isBalanced(node.left);
        BalancedPair rbp = isBalanced(node.right);
        BalancedPair sbp = new BalancedPair();
        sbp.height = Math.max(lbp.height, rbp.height) + 1;
        boolean sb = Math.abs(lbp.height - rbp.height) <= 1;
        sbp.isBalanced = lbp.isBalanced && rbp.isBalanced && sb;
        return sbp;
    }

    class Node {
        int data;
        Node left;
        Node right;
    }

    private class BalancedPair {
        int height;
        boolean isBalanced;
    }
}
