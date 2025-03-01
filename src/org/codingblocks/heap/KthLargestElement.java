package org.codingblocks.heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        int arr[] = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() < arr[i]) {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        System.out.println(pq.peek());
    }
}