package org.codingblocks.assignment.assignment10;

import java.util.*;

public class CountDifferentWaysToExpressNasSumOf1_3_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(noOfWays(n, dp));
    }

    public static long noOfWays(int n, long[] dp) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = noOfWays(n - 1, dp) + noOfWays(n - 3, dp) + noOfWays(n - 4, dp);

    }
}
