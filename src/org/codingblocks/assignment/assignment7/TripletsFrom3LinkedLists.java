package org.codingblocks.assignment.assignment7;


import java.util.Scanner;

public class TripletsFrom3LinkedLists {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        LinkedList list1 = new LinkedList();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list1.insert(val);
        }
        LinkedList list2 = new LinkedList();
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            list2.insert(val);
        }
        LinkedList list3 = new LinkedList();
        for (int i = 0; i < k; i++) {
            int val = sc.nextInt();
            list3.insert(val);
        }

        int target = sc.nextInt();
        findSum(list1.head, list2.head, list3.head, target);

    }

    public static void findSum(Node list1, Node list2, Node list3, int target) {
        Node l1 = list1;
        while (l1 != null) {
            Node l2 = list2;
            while (l2 != null) {
                Node l3 = list3;
                while (l3 != null) {
                    int sum = l1.data + l2.data + l3.data;
                    if (sum == target) {
                        System.out.println(l1.data + " " + l2.data + " " + l3.data);
                        return;
                    }
                    l3 = l3.next;
                }
                l2 = l2.next;
            }
            l1 = l1.next;
        }

    }

    static class Node {
        int data;
        Node next;

        public Node(int item) {
            this.data = item;
        }
    }

    static class LinkedList {
        Node head;
        Node tail;

        public void insert(int val) {
            Node nn = new Node(val);
            if (head == null) {
                head = nn;
            } else {
                tail.next = nn;
            }
            tail = nn;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
