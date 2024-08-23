package org.ashish.interview.hashing.setb;

import java.util.HashMap;

public class P1_CountSubarraysHavingSumK {
    public static void main(String[] args) {
        int arr[] = {10, 2, -2, -20, 10};
        System.out.println(bruteForce(arr, -10));
        System.out.println(hashingSolution(arr, -10));
    }

    public static int bruteForce(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    public static int hashingSolution(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
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
