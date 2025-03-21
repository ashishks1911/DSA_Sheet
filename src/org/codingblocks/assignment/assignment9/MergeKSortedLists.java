package org.codingblocks.assignment.assignment9;

import java.util.*;

public class MergeKSortedLists {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        Node[] lists = new Node[k];
        for (int i = 0; i < k; i++) {
            Node head = null;
            Node tail = null;
            for (int j = 0; j < n; j++) {
                int val = sc.nextInt();
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                    tail = temp;
                } else {
                    tail.next = temp;
                    tail = tail.next;
                }
            }
            lists[i] = head;

        }

        Node ans = mergeKLists(lists);
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.next;
        }


    }

    public static Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        for (Node list : lists) {
            pq.add(list);
        }

        Node dummy = new Node(0);
        Node temp = dummy;
        while (!pq.isEmpty()) {
            Node rv = pq.poll();
            dummy.next = rv;
            dummy = dummy.next;
            if (rv.next != null) {
                pq.add(rv.next);
            }
        }
        return temp.next;
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
