package org.codingblocks.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        //for min heap
        PriorityQueue<Integer> hp = new PriorityQueue<>();

        //for max heap
//        PriorityQueue<Integer> hp = new PriorityQueue<>(Collections.reverseOrder());

        hp.add(10);
        hp.add(20);
        hp.add(30);
        hp.add(1);
        hp.add(5);
        hp.add(7);
        hp.add(3);
        hp.add(2);
        hp.add(-4);
        System.out.println(hp);

    }
}
