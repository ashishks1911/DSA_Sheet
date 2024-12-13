package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class LinkedListKAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkNode list = new LinkNode();
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());
        }
        int k = sc.nextInt();

        if (k >= n) {
            list.display();
        } else {
            int count = 1;
            LinkNode.Node head = list.getHead();
            LinkNode.Node temp = head;
            while (temp != null) {
                if (count == n - k)
                    break;
                count++;
                temp = temp.next;
            }

            LinkNode.Node nn = temp.next;
            System.out.println();
            LinkNode.Node tail = temp.next;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = head;
            temp.next = null;
            head = nn;
            list.setHead(head);
            list.display();

        }

    }

    static class LinkNode {
        class Node {
            int data;
            Node next;
        }

        public Node head;

        public void insert(int item) {
            Node nn = new Node();
            nn.data = item;
            if (head == null) {
                head = nn;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = nn;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public Node getNode() {
            return new Node();
        }

        public Node getHead() {
            return head;
        }

        public void setHead(Node node) {
            head = node;
        }
    }
}
