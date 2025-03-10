package org.codingblocks.assignment.assignment9;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HostelVisit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int k = sc.nextInt();       //hostels to visit
        int i = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return Long.compare(o2, o1);
            }
        });

        while (q-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                // Note : x * x may exceed the int range
                long distance = (long) x * x + (long) y * y;   //  (x2-x1)^2 + (y2-y1)^2  and {x1, y1} is origin i.e., {0,0}
                pq.add(distance);
                if (pq.size() > k) {
                    pq.poll();
                }
            } else {
                System.out.println(pq.peek());
            }
        }
    }
}
