package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class MergeSortedLinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n1 = sc.nextInt();
            LinkNode list1 = new LinkNode();
            for (int i = 0; i < n1; i++) {
                list1.insert(sc.nextInt());
            }
            int n2 = sc.nextInt();
            LinkNode list2 = new LinkNode();
            for (int i = 0; i < n2; i++) {
                list2.insert(sc.nextInt());
            }

            LinkNode list = new LinkNode();
            LinkNode.Node head = merge(list1.getHead(), list2.getHead());
            list.setHead(head);
            list.display();

        }
    }

    public static LinkNode.Node merge(LinkNode.Node list1, LinkNode.Node list2) {
        LinkNode linkNode = new LinkNode();
        LinkNode.Node ll = linkNode.getNode();
        LinkNode.Node temp = ll;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                ll.next = list1;
                ll = ll.next;
                list1 = list1.next;
            }else {
                ll.next = list2;
                ll = ll.next;
                list2 = list2.next;
            }
        }
        if (list1!=null) {
            ll.next = list1;
        }

        if (list2!=null){
            ll.next = list2;
        }
        return temp.next;
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
        public Node getHead(){
            return head;
        }
        public void setHead(Node node){
            head = node;
        }
    }
}
