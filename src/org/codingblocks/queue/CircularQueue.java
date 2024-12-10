package org.codingblocks.queue;

public class CircularQueue {
    protected int[] arr;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        arr = new int[5];
    }

    public CircularQueue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void Enqueue(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        int idx = (front + size) % arr.length;  // change for circular Queue
        arr[idx] = item;
        size++;
    }

    public int Dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int v = arr[front];
        front = (front + 1) % arr.length;

        size--;
        return v;
    }

    public int getFront() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int v = arr[front];
        return v;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
