package org.codingblocks.blind45.dp;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        System.out.println(topDown(0, nums, dp));
    }

    public static int topDown(int i, int[] nums, int[] dp) {
        if (i >= nums.length)
            return 0;
        if (dp[i] != -1) return dp[i];
        int rob = nums[i] + topDown(i + 2, nums, dp);
        int notRob = topDown(i + 1, nums, dp);
        return dp[i] = Math.max(rob, notRob);
    }

    public int bottomUp(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[dp.length - 1];
    }

    public static int spaceOptimization(int[] nums) {
        int prev2 = nums[0];        // dp[i-2]
        if (nums.length == 1)
            return prev2;

        int prev = Math.max(nums[0], nums[1]);      // dp[i-1]
        if (nums.length == 2) {
            return prev;
        }
        int curr = 0;
        for (int i = 2; i < nums.length; i++) {
            curr = Math.max(nums[i] + prev2, prev);
            prev2 = prev;
            prev = curr;
        }
        return curr;
    }


}
