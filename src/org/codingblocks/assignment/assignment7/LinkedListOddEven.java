package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class LinkedListOddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        Node list = oddEven(head);
        while (list != null) {
            System.out.print(list.data + " ");
            list = list.next;
        }
    }


    public static Node oddEven(Node head) {
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node temp = head;
        while (temp != null) {
            if ((temp.data & 1) == 0) {
                //even
                if (evenHead == null) {
                    evenHead = evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            } else {
                //odd
                if (oddHead == null) {
                    oddHead = oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            }
            temp = temp.next;
        }
        if (oddTail != null) {
            oddTail.next = evenHead;
        }
        if (evenTail != null) {
            evenTail.next = null;
        }
        return oddHead != null ? oddHead : evenHead;
    }

    static class Node {
        int data;
        Node next;

        public Node(int item) {
            data = item;
        }
    }

}

