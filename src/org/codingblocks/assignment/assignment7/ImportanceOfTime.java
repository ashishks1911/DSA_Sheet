package org.codingblocks.assignment.assignment7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImportanceOfTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(sc.nextInt());
        }
        int[] org_order = new int[n];
        for (int i = 0; i < n; i++) {
            org_order[i] = sc.nextInt();
        }
        System.out.println(impOfTime(org_order, q));

    }

    public static int impOfTime(int[] org_order, Queue<Integer> q) {
        int count =0;
        for (int i = 0; i < org_order.length; i++) {
            int task = q.poll();
            while (org_order[i] != task) {
                q.offer(task);
                task = q.poll();
                count++;
            }
            count++;
        }
        return count;
    }
}
