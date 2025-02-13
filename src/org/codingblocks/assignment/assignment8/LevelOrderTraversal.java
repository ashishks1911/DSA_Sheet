package org.codingblocks.assignment.assignment8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        res.add(new ArrayList<>());
        int level = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            res.add(new ArrayList<>());

            for (int i = 0; i < len; i++) {
                TreeNode nn = q.remove();
                res.get(level).add(nn.val);
                if (nn.left != null) {
                    q.add(nn.left);
                }
                if (nn.right != null) {
                    q.add(nn.right);
                }
            }
            level++;
        }
        return res;
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
