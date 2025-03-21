package org.codingblocks.dp.part1;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int []dp = new int[arr.length];
        Arrays.fill(dp, -1);
        int zero = minCostDp(arr, 0, dp);
        int one = minCostDp(arr, 1, dp);
        System.out.println(Math.min(zero, one));

    }
    public static int minCost(int[] arr, int i) {
        if (i >= arr.length) {
            return 0;
        }
        int f = minCost(arr, i + 1);
        int s = minCost(arr, i + 2);
        return Math.min(f, s) + arr[i];
    }
    public static int minCostDp(int[] arr, int i, int []dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int f = minCostDp(arr, i + 1, dp);
        int s = minCostDp(arr, i + 2, dp);
        return dp[i] = Math.min(f, s) + arr[i];
    }

}
