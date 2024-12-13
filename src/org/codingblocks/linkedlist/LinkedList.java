package org.codingblocks.linkedlist;

public class LinkedList {
    class Node {
        int val;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    // O(1)
    public void addFirst(int item) {
        Node n = new Node();
        n.val = item;
        if (size == 0) {
            head = n;
            tail = n;
            size++;
        } else {
            n.next = head;
            head = n;
            size++;
        }
    }

    // O(1)
    public void addLast(int item) {
        if (size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }

    }

    public void addAtIndex(int item, int index) {
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            Node prev = getNode(index- 1);
            nn.next = prev.next;
            prev.next = nn;
            size++;
        }
    }

    // O(1)
    public int getFirst() {
        return head.val;
    }

    // O(1)
    public int getLast() {
        return tail.val;
    }

    // O(1)
    public int getAtIndex(int k) {
        return getNode(k).val;
    }

    // O(N)
    private Node getNode(int k) {
        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }
        System.out.println(".");
    }

    // O(1)
    public int removeFirst() {
        int v = head.val;
        if (size == 1) {
            head = null;
            tail = null;
            size--;
        } else {
            Node n = head;
            head = head.next;
            n.next = null;
            size--;
        }
        return v;
    }

    //
    public int removeLast() {
        if (size == 1) {
            return removeFirst();
        } else {
            Node prev = getNode(size - 2);
            int v = tail.val;
            tail = prev;
            tail.next = null;
            size--;
            return v;
        }
    }

    public int removeAtIndex(int k) {
        if (k == 0) {
            return removeFirst();
        } else if (k == size - 1) {
            return removeLast();
        } else {
            Node prev = getNode(k - 1);
            Node curr = getNode(k);
            prev.next = curr.next;
            size--;
            return curr.val;
        }

    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setHead(Node head) {
        this.head = head;
    }
}
