package org.codingblocks.arrays;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 * <p>
 * To Do : https://leetcode.com/problems/search-a-2d-matrix/description/
 */
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        System.out.println(search(matrix, 20));

    }

    public static boolean search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;  // discard column
            } else {
                row++;  //discard row
            }
        }
        return false;
    }
}
