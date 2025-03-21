package org.codingblocks.assignment.assignment9;

import java.util.*;

public class MergeKSortedArrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.value - b.value);

        for (int i = 0; i < k; i++) {
            pq.add(new Element(i, 0, arr[i][0]));
        }

        int[] ans = new int[k * n];
        int t = 0;
        while (!pq.isEmpty()) {
            Element rv = pq.poll();
            ans[t] = rv.value;
            t++;
            if (rv.index + 1 < arr[rv.array].length) {
                pq.add(new Element(rv.array, rv.index + 1, arr[rv.array][rv.index + 1]));
            }
        }

        for (int val : ans) {
            System.out.print(val + " ");
        }

    }

    static class Element {
        int array;
        int index;
        int value;

        public Element(int array, int index, int value) {
            this.array = array;
            this.index = index;
            this.value = value;
        }
    }

}
