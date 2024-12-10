package org.codingblocks.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueReverse {
    public static void main(String[] args) {
        Queue<Integer> qt = new LinkedList<>();
        qt.offer(10);
        qt.offer(20);
        qt.offer(30);
        qt.offer(40);
        qt.offer(50);
        System.out.println(qt);
        reverse(qt);
        System.out.println(qt);

    }
    public static void reverse(Queue<Integer> queue){
        if (queue.isEmpty()){
            return;
        }
        int x = queue.poll();
        reverse(queue);
        queue.offer(x);
    }
}
