package org.codingblocks.recursion.lec21;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0}, {5, 2, 0, 0, 0, 0, 0, 0, 0}, {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0}, {9, 0, 0, 8, 6, 3, 0, 0, 5}, {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0}, {0, 0, 0, 0, 0, 0, 0, 7, 4}, {0, 0, 5, 2, 0, 6, 3, 0, 0}};
        print(grid, 0, 0);
    }

    public static void print(int[][] grid, int row, int col) {
        if (col == grid[0].length) {
            row++;
            col = 0;
        }
        if (row == grid.length) {
            System.out.println("hi 1");
            display(grid);
            return;
        }
        if (grid[row][col] != 0) {
            System.out.println("h2");
            print(grid, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                System.out.println("h3");
                if (isSafe(grid, row, col, val)) {
                    grid[row][col] = val;
                    print(grid, row, col + 1);
                    grid[row][col] = 0;
                }
            }
        }
    }

    public static boolean isSafe(int[][] grid, int row, int col, int val) {
        //row
        for (int c = 0; c < grid.length; c++) {
            if (grid[row][c] == val)
                return false;
        }
        //col
        for (int r = 0; r < grid.length; r++) {
            if (grid[r][col] == val) {
                return false;
            }
        }
        //3*3 matrix
        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = 0; i < r + 3; i++) {
            for (int j = 0; j < c + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
