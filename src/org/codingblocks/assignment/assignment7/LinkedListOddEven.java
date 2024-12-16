package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class LinkedListOddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkNode ll = new LinkNode();
        for (int i = 0; i < n; i++) {
            ll.insert(sc.nextInt());
        }

        LinkNode l1 = new LinkNode();
        LinkNode l2 = new LinkNode();

        Node head = ll.head;
        while (head != null) {
            if ((head.data & 1) == 0) {
                l2.insert(head.data);
            } else {
                l1.insert(head.data);
            }
            head = head.next;
        }
        l1.tail.next = l2.head;

        Node temp = l1.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    static class Node {
        int data;
        Node next;

        public Node(int item) {
            data = item;
        }
    }

    static class LinkNode {
        public Node head;
        public Node tail;

        public void insert(int item) {
            Node nn = new Node(item);
            if (head == null) {
                head = nn;
                tail = nn;
            } else {
                tail.next = nn;
                tail = nn;
            }
        }
    }

}

