package org.codingblocks.blind45.arrays.part1;

public class MaximumSumCircularSubArray {
    public static int bruteForce(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int idx = (i + j) % n;
                sum += nums[idx];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }





}
