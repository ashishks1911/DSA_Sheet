package org.codingblocks.tree.binarytree;

public class ConstructBinaryTreeFromPreorderAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return create(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode create(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {
        if (plo > phi || ilo > ihi) {
            return null;
        }
        TreeNode node = new TreeNode(pre[plo]);
        int idx = search(in, ilo, ihi, pre[plo]);
        int ne = idx - ilo;                                 //no. of elements
        node.left = create(pre, plo + 1, plo + ne, in, ilo, idx - 1);
        node.right = create(pre, plo + ne + 1, phi, in, idx + 1, ihi);
        return node;
    }

    public int search(int[] inorder, int si, int ei, int item) {
        for (int i = si; i <= ei; i++) {
            if (inorder[i] == item) {
                return i;
            }
        }
        return -1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
