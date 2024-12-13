package org.codingblocks.linkedlist;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {

    }

    public static LinkedList.Node getIntersectionNode(LinkedList.Node headA, LinkedList.Node headB) {
        LinkedList.Node v = headA;
        LinkedList.Node vgf = headB;
        while (v != vgf){
            if (v==null)
                v = headB;
            else
                v = v.next;

            if (vgf==null)
                vgf = headA;
            else
                vgf = vgf.next;
        }
        return vgf;
    }
}
