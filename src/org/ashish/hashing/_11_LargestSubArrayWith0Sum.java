package org.ashish.hashing;

import java.util.HashMap;

public class _11_LargestSubArrayWith0Sum {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println(bruteForce(arr));
        System.out.println(optimalSolution(arr));
    }

    public static int bruteForce(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    max = Math.max(j - i + 1, max);
                }
            }
        }
        return max;
    }

    public static int optimalSolution(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, largestSubArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                largestSubArray = i + 1;
            } else if (map.containsKey(sum))
                largestSubArray = Math.max(i - map.get(sum), largestSubArray);
            else
                map.put(sum, i);
        }
        return largestSubArray;
    }
}
