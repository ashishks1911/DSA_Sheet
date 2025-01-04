package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class SumOfTwoLinkedLists {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Node head1 = null, tail1 = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node nn = new Node(val);
            if (head1 == null) {
                head1 = nn;
                tail1 =nn;
            } else {
                tail1.next = nn;
                tail1 = nn;
            }
        }
        Node head2 = null, tail2 = null;
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            Node nn = new Node(val);
            if (head2 == null) {
                head2 = nn;
                tail2 = nn;
            } else {
                tail2.next = nn;
                tail2 = nn;
            }
        }
        Node temp1 = reverse(head1, null);
        Node temp2 = reverse(head2, null);

        Node list = sumList(temp1, temp2, 0);
        list = reverse(list, null);
        while (list!=null){
            System.out.print(list.data+" ");
            list = list.next;
        }
    }
    public static Node reverse(Node curr, Node prev){
        if (curr==null){
            return prev;
        }
        Node temp = reverse(curr.next, curr);
        curr.next = prev;
        return temp;
    }

    public static Node sumList(Node list1, Node list2, int carry) {
        if (list1 == null && list2 == null && carry == 0) {
            return null;
        }
        int sum = carry;
        if (list1 != null) {
            sum += list1.data;
            list1 = list1.next;
        }
        if (list2 != null) {
            sum += list2.data;
            list2 = list2.next;
        }
        carry = sum / 10;
        Node newNode = new Node(sum % 10);
        newNode.next = sumList(list1, list2, carry);
        return newNode;
    }

    static class Node {
        int data;
        Node next;

        public Node(int item) {
            this.data = item;
        }
    }

    public static void display(Node curr){
        Node temp = curr;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
