package org.ashish.binarysearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImportanceOfTime {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.offer(sc.nextInt());
        }
        int ideal[] = new int[n];
        for (int i = 0; i < n; i++) {
            ideal[i] = sc.nextInt();
        }

        System.out.println(ImpofTime(q, ideal));
    }

    public static int ImpofTime(Queue<Integer> q, int[] orig_order){
        // Write your Code here
        int count = 0;
        for (int k = 0; k < orig_order.length; k++) {
            int task = q.poll();
            if (task != orig_order[k]) {
            }
            //TODO
        }
        return count;
    }


}