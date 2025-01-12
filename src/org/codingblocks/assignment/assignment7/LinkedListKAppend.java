package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class LinkedListKAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node nn = new Node(val);
            if (head == null) {
                head = nn;
            } else {
                tail.next = nn;
            }
            tail = nn;
        }
        int k = sc.nextInt();
        Node newHead = head;
        if (k > n) {
            k = k % n;
        }
        if(k<n) {
            Node curr = head;
            for (int i = 0; i < size(head) - k - 1; i++) {
                curr = curr.next;
            }
            newHead = curr.next;
            curr.next = null;

            Node temp = newHead;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = head;
        }

        Node ans = newHead;
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }

    }

    static class Node {
        int data;
        Node next;

        public Node(int item) {
            this.data = item;
        }
    }

    public static int size(Node head) {
        Node curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}
