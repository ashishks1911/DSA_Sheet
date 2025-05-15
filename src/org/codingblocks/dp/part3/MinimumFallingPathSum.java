package org.codingblocks.dp.part3;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int dp[][] = new int[matrix.length][matrix[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, 9999999);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans, minimumFallingPath(matrix, 0, i, dp));
        }
        System.out.println(ans);

    }

    public static int minimumFallingPath(int[][] matrix, int cr, int cc, int[][] dp) {
        if (cc < 0 || cc >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if (cr == matrix.length - 1) {
            return matrix[cr][cc];
        }
        if (dp[cr][cc] != 9999999) {
            return dp[cr][cc];
        }
        int ld = minimumFallingPath(matrix, cr + 1, cc - 1, dp);
        int rd = minimumFallingPath(matrix, cr + 1, cc + 1, dp);
        int d = minimumFallingPath(matrix, cr + 1, cc, dp);
        return dp[cr][cc] = Math.min(d, Math.min(rd, ld)) + matrix[cr][cc];
    }
}
