package org.codingblocks.assignment.assignment7;

import org.codingblocks.linkedlist.LinkedList;

import java.util.Scanner;

public class LinkedListKReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node nn = new Node(val);
            if (head == null)
                head = nn;
            else
                tail.next = nn;
            tail = nn;
        }

        Node hh = reverseKGroup(head, k);
        display(hh);

    }

    public static Node reverseKGroup(Node head, int k) {
        Node curr = head;
        Node newHead = null;
        Node newTail = null;
        while (curr != null) {
            int count = 0;
            Node groupHead = curr;
            Node prev = null;
            //Handling leftovers nodes
            if (size(curr) < k) {
                if(newTail!=null){
                    newTail.next = curr;
                }
                break;
            }
            while (curr != null && count < k) {
                Node ahead = curr.next;
                curr.next = prev;
                prev = curr;
                curr = ahead;
                count++;
            }
            if (newHead == null) {
                newHead = prev;
            }
            if (newTail != null) {
                newTail.next = prev;
            }
            newTail = groupHead;
            display(newHead);
        }
        return newHead;
    }


    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        public Node(int item) {
            this.data = item;
            this.next = null;
        }
    }
    public  static int size(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
