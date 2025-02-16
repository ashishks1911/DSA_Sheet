package org.codingblocks.assignment.assignment8;

public class BinaryTreeFromPostorderAndInorder {
    public static void main(String[] args) {

    }

    private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {

        // write your code here
        if(plo>phi || ilo>ihi)
            return null;
        Node node = new Node();
        node.data = post[phi];
        int idx = search(in, ilo, ihi, post[phi]);
        int ne = idx - ilo;
        node.left = construct(post, plo, plo+ne-1, in, ilo, idx-1);
        node.right = construct(post, plo+ne, phi-1, in, idx + 1 , ihi);
        return node;
    }

    public int search(int []in, int si, int ei, int item){
        for(int i = si; i<=ei; i++){
            if(in[i]==item){
                return i;
            }
        }
        return -1;
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}
