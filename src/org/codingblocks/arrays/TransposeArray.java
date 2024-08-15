package org.codingblocks.arrays;

/**
 *
 * Logic :
 * [0][0] [0][1] [0][2] [0][3]
 * [1][0] [1][1] [1][2] [1][3]
 * [2][0] [2][1] [2][2] [2][3]
 * [3][0] [3][1] [3][2] [3][3]
 *
 * swap => [1][0] [0][1]
 * swap => [2][0] [0][2]
 * swap => [2][1] [1][2]
 * swap => [3][0] [0][3]
 * swap => [3][1] [1][3]
 * swap => [3][2] [2][3]
 *
 */
public class TransposeArray {
    public static void main(String[] args) {
        int [][] arr = {
                {2, 3, 1, 4},
                {5, 6, 7, 9},
                {8, 12, 11, 10},
                {16, 15, 14, 13}
        };

        transpose(arr);
        Array2D.display(arr);

    }

    private static void transpose(int[][] arr) {
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr[i].length; j++){
                if (i!=j) {
                    int temp = arr[i][j];
                    arr[i][j] =  arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }
    }
}
