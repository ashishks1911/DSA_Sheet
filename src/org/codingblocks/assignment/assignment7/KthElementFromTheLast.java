package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class KthElementFromTheLast {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        Node head = null, tail = null;
        do {
            in = sc.nextInt();
            Node nn = new Node(in);
            if (head == null) {
                head = tail = nn;
            } else {
                tail.next = nn;
                tail = nn;
            }
        } while (in != -1);

        int k = sc.nextInt();
        System.out.println(kThLastElement(head, k));
    }
    public static int kThLastElementOptimal(Node head, int k) {
        int diff = 0;
        Node first = head;
        Node last = head;
        while (last.next != null) {
            if (diff < k) {
                last = last.next;
                diff++;
            } else {
                first = first.next;
                last = last.next;
            }
        }
        if (diff < k) {
            return -1;
        }
        return first.data;
    }
    public static int kThLastElement(Node head, int k) {
        int len = 0;
        Node temp = head;
        while (temp.data != -1) {
            temp = temp.next;
            len++;
        }
        if (k > len) {
            return -1;
        }
        temp = head;
        for (int i = 0; i < len - k; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    static class Node {
        int data;
        Node next;

        public Node(int item) {
            this.data = item;
        }
    }
}
