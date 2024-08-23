package org.ashish.hashing;

import java.util.HashMap;

public class _12_LargestSubArrayWithEqual_0sAnd1s {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 1, 0, 0};
        System.out.println(bruteForce(arr));
        System.out.println(optimalSolution(arr));
    }

    public static int bruteForce(int[] arr) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += (arr[j] == 0) ? -1 : +1;
                if (sum == 0)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static int optimalSolution(int[] arr) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        hmap.put(0, -1);
        int sum = 0, len = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] == 0) ? -1 : +1;
            if (hmap.containsKey(sum)) {
                len = Math.max(len, i - hmap.get(sum));
            } else {
                hmap.put(sum, i);
            }
        }
        return len;
    }
}
