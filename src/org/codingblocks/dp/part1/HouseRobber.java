package org.codingblocks.dp.part1;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 3, 1};
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        System.out.println(robber(arr, 0, dp));
        System.out.println(robberBackward(arr, arr.length - 1, dp));

    }

    public static int robberHouse(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < dp.length; i++) {
            int rob = arr[i] + dp[i - 2];
            int dont_rob = dp[i - 1];
            dp[i] = Math.max(rob, dont_rob);
        }
        return dp[dp.length - 1];
    }

    public static int robber(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = arr[i] + robber(arr, i + 2, dp);
        int dont_rob = robber(arr, i + 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }

    public static int robberBackward(int[] arr, int i, int[] dp) {
        if (i < 0) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }

        int rob = arr[i] + robberBackward(arr, i - 2, dp);
        int dont_rob = robberBackward(arr, i - 1, dp);
        return dp[i] = Math.max(rob, dont_rob);
    }
}
