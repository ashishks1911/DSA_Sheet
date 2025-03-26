package org.codingblocks.assignment.assignment10;

import java.util.*;

public class TopKMostFrequentNumberInAStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    if (o1.getValue() == o2.getValue()) {
                        return o1.getKey() - o2.getKey();
                    } else {
                        return o1.getValue() - o2.getValue();
                    }
                }
            });

            for (int i = 0; i < n; i++) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    pq.add(entry);
                }
                for (int j = 0; j < k; j++) {
                    if(pq.isEmpty())
                        break;
                    System.out.print(pq.poll().getKey()+" ");
                }
            }

        }
    }
}
