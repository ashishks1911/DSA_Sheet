package org.codingblocks.assignment.assignment10;

import java.util.*;

public class MinimumPathSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(minPath(arr, 0, 0, dp));


    }

    public static int minPath(int[][] grid, int cr, int cc, int[][] dp) {
        if (cr >= grid.length || cc >= grid[0].length) {
            return (int) Math.pow(10, 9);
        }
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];
        }
        if (dp[cr][cc] != -1)
            return dp[cr][cc];
        int down = grid[cr][cc] + minPath(grid, cr + 1, cc, dp);
        int right = grid[cr][cc] + minPath(grid, cr, cc + 1, dp);
        return dp[cr][cc] = Math.min(down, right);
    }
}

