package org.codingblocks.assignment.assignment8;

public class LargestBSTInTheBinaryTree {
    public static void main(String[] args) {

    }

    class Info {
        int size;
        int max;
        int min;
        int ans;
        boolean isBST;

        Info() {

        }

        Info(int s, int max, int min, int ans, boolean isBST) {
            this.size = s;
            this.max = max;
            this.min = min;
            this.ans = ans;
            this.isBST = isBST;
        }
    }

    private Info largestBSTinBT(Node root) {
        if(root==null){
            return new Info(0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);
        }

        Info lip = largestBSTinBT(root.left);
        Info rip = largestBSTinBT(root.right);
        Info sip = new Info();
        sip.min = Math.min(lip.min, Math.min(root.data, rip.min));
        sip.max = Math.max(lip.max, Math.max(root.data, rip.max));
        sip.isBST = lip.isBST && rip.isBST && (root.data> lip.max && root.data<rip.min);
        sip.size = lip.size + rip.size + 1;
        if(sip.isBST)
            sip.ans = sip.size;
        else{
            sip.ans = Math.max(lip.ans, rip.ans);
        }
        return sip;

    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}
