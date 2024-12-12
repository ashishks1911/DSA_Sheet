package org.codingblocks.linkedlist;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.display();

    }
}
