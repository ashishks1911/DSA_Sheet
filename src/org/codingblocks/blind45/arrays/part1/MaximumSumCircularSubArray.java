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

    public static int maxCicular(int[] nums) {
        int kd = kadanes(nums);
        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
            nums[i] = -nums[i];
        }
        int inverseKd = kadanes(nums);
        return Math.max(kd, totalSum + inverseKd);
    }

    public static int kadanes(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }


}
