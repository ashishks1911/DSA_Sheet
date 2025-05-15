package org.codingblocks.dp.part3;

/**
 * https://leetcode.com/problems/minimum-path-sum/description/
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(pathSum(grid, 0, 0));
    }

    public static int pathSum(int[][] grid, int cr, int cc) {
        if (cr == grid.length - 1 && cc == grid[0].length - 1) {
            return grid[cr][cc];
        }
        if (cr >= grid.length || cc >= grid[0].length) {
            return Integer.MAX_VALUE;
        }
        int r = pathSum(grid, cr, cc + 1);
        int d = pathSum(grid, cr + 1, cc);
        return Math.min(r, d) + grid[cr][cc];
    }
}
