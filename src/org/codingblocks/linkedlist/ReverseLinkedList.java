package org.codingblocks.linkedlist;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        LinkedList.Node head = ll.getHead();
        ll.display();
        LinkedList.Node nn = reverse(ll.getHead(), null);
        ll.setHead(nn);
        ll.display();
    }
    //recursive approach
    public static LinkedList.Node reverse(LinkedList.Node curr, LinkedList.Node prev){
        if (curr==null){
            return prev;
        }
        LinkedList.Node temp = reverse(curr.next, curr);
        curr.next = prev;
        return temp;
    }

    //iterative approach
    public static LinkedList.Node reverse(LinkedList.Node head){
        LinkedList.Node prev = null;
        LinkedList.Node curr = head;
        while (curr != null) {
            LinkedList.Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }
}
