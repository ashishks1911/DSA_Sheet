package org.codingblocks.assignment.assignment10;

import java.util.*;

public class HouseRobber2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }

        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int[] skipFirst = new int[n - 1];
        int[] skipLast = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            skipFirst[i] = arr[i + 1];
            skipLast[i] = arr[i];
        }
        int robLast = robber(skipFirst, 0, dp);
        Arrays.fill(dp, -1);
        int robFirst = robber(skipLast, 0, dp);
        System.out.println(Math.max(robLast, robFirst));

    }

    public static int robber(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1)
            return dp[i];
        int rob = nums[i] + robber(nums, i + 2, dp);
        int notRob = robber(nums, i + 1, dp);
        return dp[i] = Math.max(rob, notRob);
    }

}
