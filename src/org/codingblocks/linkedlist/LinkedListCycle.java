package org.codingblocks.linkedlist;

/**
 * https://leetcode.com/problems/linked-list-cycle/description/
 */
public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        LinkedList.Node head = ll.getHead();
        LinkedList.Node tail = ll.getTail();
        tail.next = head.next;
        System.out.println(hasCycle(head));

    }
    public static boolean hasCycle(LinkedList.Node head) {
        LinkedList.Node slow = head;
        LinkedList.Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast==slow)
                return true;
        }
        return false;
    }
}
