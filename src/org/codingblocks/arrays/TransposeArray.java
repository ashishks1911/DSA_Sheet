package org.codingblocks.arrays;

/**
 * Logic :
 * [0][0] [0][1] [0][2] [0][3]
 * [1][0] [1][1] [1][2] [1][3]
 * [2][0] [2][1] [2][2] [2][3]
 * [3][0] [3][1] [3][2] [3][3]
 * <p>
 * swap => [1][0] [0][1]
 * swap => [2][0] [0][2]
 * swap => [2][1] [1][2]
 * swap => [3][0] [0][3]
 * swap => [3][1] [1][3]
 * swap => [3][2] [2][3]
 */
public class TransposeArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 1, 4},
                {5, 6, 7, 9},
                {8, 12, 11, 10},
                {16, 15, 14, 13}
        };

        transpose(arr);
        Array2D.display(arr);

    }

    //only for square matrix
    private static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                if (i != j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }

    //for all matrices
    public int[][] transpose2(int[][] matrix) {
        int ans[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}
