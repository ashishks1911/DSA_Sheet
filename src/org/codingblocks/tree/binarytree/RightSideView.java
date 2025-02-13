package org.codingblocks.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightSide(root, 1, ans);
        return ans;
    }

    int maxDepth = 0;
    public void rightSide(TreeNode root, int currentLevel, List<Integer> ll) {
        if (root == null)
            return;

        if (currentLevel > maxDepth) {
            ll.add(root.val);
            maxDepth = currentLevel;
        }
        rightSide(root.right, currentLevel + 1, ll);
        rightSide(root.left, currentLevel + 1, ll);
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
