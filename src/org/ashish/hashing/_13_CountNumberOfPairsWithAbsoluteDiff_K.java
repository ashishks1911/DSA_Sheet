package org.ashish.hashing;

import java.util.HashMap;

/**
 * Important
 */
public class _13_CountNumberOfPairsWithAbsoluteDiff_K {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 1};
        System.out.println(countKDifference(arr,1));
        System.out.println(betterSolution(arr,1));
        System.out.println(betterSolution(arr,arr.length,1));
        System.out.println(optimalSolution(arr,1));

    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                if (Math.abs(diff) == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int betterSolution(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - k)) {
                count += map.get(nums[i] - k);
            } else if (map.containsKey(nums[i] + k)) {
                count += map.get(nums[i] + k);
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }

    public static int optimalSolution(int[] nums, int k) {
        int freq[] = new int[101];
        for (int a : nums) {
            freq[a]++;
        }

        int ans = 0;
        for (int i = 0; i < 101 - k; i++) {
            ans += freq[i] * freq[i + k];
        }
        return ans;
    }

    public static int betterSolution(int[] nums, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            count += map.getOrDefault(nums[i] - k, 0) + map.getOrDefault(nums[i] + k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        return count;
    }


}
