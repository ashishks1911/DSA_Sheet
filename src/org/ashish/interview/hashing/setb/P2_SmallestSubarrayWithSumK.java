package org.ashish.interview.hashing.setb;

import java.util.HashMap;

public class P2_SmallestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 10, 2, 1};
        System.out.println(bruteForce(arr,12));
        System.out.println(hashingSolution(arr,12));

        int[] arr2 = {-8, -8, -3, 8};
        System.out.println(bruteForce(arr2,5));
        System.out.println(hashingSolution(arr2,5));

    }

    public static int bruteForce(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    min = Math.min(j - i + 1, min);
                }
            }
        }
        return min;
    }

    public static int hashingSolution(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                min = Math.min(i - map.get(k - arr[i]) + 1, min);
            }
            map.put(arr[i], i);
        }
        return min;
    }
}
