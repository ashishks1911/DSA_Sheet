package org.codingblocks.assignment.assignment10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Exactly similar to House Robber
 */
public class smartRobber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int []dp = new int[n+1];
            Arrays.fill(dp, -1);
            System.out.println(smartRobber(arr, 0, dp));

        }
    }

    // T.C : O(n^2) : Exponential
    public static int smartRobber(int[] arr, int idx) {
        if (idx >= arr.length) {
            return 0;
        }
        int rob = arr[idx] + smartRobber(arr, idx + 2);
        int notRob = smartRobber(arr, idx + 1);
        return Math.max(rob, notRob);
    }

    // Better
    public static int smartRobber(int[] arr, int idx, int[] dp) {
        if (idx >= arr.length) {
            return 0;
        }
        if (dp[idx] != -1)
            return dp[idx];
        int rob = arr[idx] + smartRobber(arr, idx + 2, dp);
        int notRob = smartRobber(arr, idx + 1, dp);
        return dp[idx] = Math.max(rob, notRob);
    }


}
