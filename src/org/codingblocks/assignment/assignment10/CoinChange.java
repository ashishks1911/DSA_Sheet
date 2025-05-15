package org.codingblocks.assignment.assignment10;

import java.util.*;
public class CoinChange {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[][] dp = new int[target + 1][n];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }

        int res = coinChange(arr, target, 0, dp);
        System.out.println(res);

    }

    public static int coinChange(int[] arr, int target, int idx, int[][] dp) {
        if (target == 0) {
            return 1;
        }
        if (idx == arr.length) {
            return 0;
        }
        if (dp[target][idx] != -1)
            return dp[target][idx];
        int take = 0;
        if (arr[idx] <= target)
            take = coinChange(arr, target - arr[idx], idx, dp);
        int notTake = coinChange(arr, target, idx + 1, dp);
        return dp[target][idx] = (take + notTake) % ((int) Math.pow(10, 9) + 7);

    }


}
