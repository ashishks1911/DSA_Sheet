package org.codingblocks.assignment.assignment10;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Count ways to reach nth stair
 * Similar to Fibonacci
 */
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(climbing(n));

    }

    public static int climbing(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int f = climbing(n - 1);
        int s = climbing(n - 2);
        return f + s;
    }

    public static int climbing(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int f = climbing(n - 1, dp);
        int s = climbing(n - 2, dp);
        return dp[n] = f + s;
    }
}
