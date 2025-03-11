package org.codingblocks.assignment.assignment9;

import java.util.*;

public class MedianInAStreamOfRunningIntegers {
    public class Main {
        static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            List<List<Integer>> ans = new ArrayList<>();
            while (t-- > 0) {
                int n = sc.nextInt();
                List<Integer> ll = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    //insert
                    insert(val);
                    balanceHeaps();
                    ll.add(findMedian());
                }
                ans.add(ll);
                maxHeap.clear();
                minHeap.clear();
            }

            for (List<Integer> ll : ans) {
                for (int a : ll) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
        }

        public static void insert(int num) {
            if (maxHeap.isEmpty() || maxHeap.peek() > num)
                maxHeap.add(num);
            else
                minHeap.add(num);
        }

        public static void balanceHeaps() {
            //either both the heap will have equal elements or max heap will have one extra
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (maxHeap.size() < minHeap.size()) {
                maxHeap.add(minHeap.poll());
            }

        }

        public static int findMedian() {
            if (maxHeap.size() == minHeap.size())
                return (maxHeap.peek() + minHeap.peek()) / 2;
            else
                return maxHeap.peek();
        }
    }

    /**
     * brute force O(n2)
     */
    public void usingInsertionSort() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] ans = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            ans[0] = arr[0];
            for (int i = 1; i < n; i++) {

                int val = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > val) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = val;
                int len = i + 1;

                if ((len & 1) == 1) {
                    //Odd
                    ans[i] = arr[(len) / 2];

                } else {
                    //Even
                    ans[i] = (arr[(len / 2) - 1] + arr[(len) / 2]) / 2;

                }

            }

            for (int ar : ans) {
                System.out.print(ar + " ");
            }

        }
    }
}