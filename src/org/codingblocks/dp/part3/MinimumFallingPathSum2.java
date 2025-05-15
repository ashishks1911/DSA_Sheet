package org.codingblocks.dp.part3;

import java.util.Arrays;

public class MinimumFallingPathSum2 {
    public static void main(String[] args) {
        int[][] grid = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int dp[][] = new int[grid.length][grid[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, 9999999);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < grid[0].length; i++) {
            ans = Math.min(ans, minimumFallingPath(grid, 0, i, dp));
        }
        System.out.println(ans);

    }

    public static int minimumFallingPath(int[][] matrix, int cr, int cc, int[][] dp) {
        if (cr == matrix.length - 1) {
            return matrix[cr][cc];
        }
        if (dp[cr][cc] != 9999999) {
            return dp[cr][cc];
        }
        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < matrix[0].length; col++) {
            if (col == cc) {
                continue;
            }
            ans = Math.min(ans, minimumFallingPath(matrix, cr + 1, col, dp));
        }
        return dp[cr][cc] = ans + matrix[cr][cc];
    }
}
