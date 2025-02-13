package org.codingblocks.tree.binarytree;

public class DiameterOfBinaryTreeOptimized {
    public DiaPair diameter(TreeNode root) {
        if (root == null)
            return new DiaPair();
        DiaPair ldp = diameter(root.left);
        DiaPair rdp = diameter(root.right);
        DiaPair sdp = new DiaPair();     //self dia pair
        sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
        int sd = ldp.ht + rdp.ht + 2;   //self diameter
        sdp.dia = Math.max(sd, Math.max(ldp.dia, rdp.dia));
        return sdp;
    }

    class DiaPair {
        int dia = 0;
        int ht = -1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
