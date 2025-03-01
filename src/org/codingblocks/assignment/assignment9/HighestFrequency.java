package org.codingblocks.assignment.assignment9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ar : arr) {
            map.put(ar, map.getOrDefault(ar, 0) + 1);
        }

        int max = 0, res = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                res = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println(res);

    }
}
