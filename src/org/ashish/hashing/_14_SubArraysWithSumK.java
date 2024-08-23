package org.ashish.hashing;

import java.util.HashMap;
import java.util.Map;

public class _14_SubArraysWithSumK {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};

    }

    public static int optimalSolution(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                count++;
            }
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
