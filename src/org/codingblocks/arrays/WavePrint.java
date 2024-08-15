package org.codingblocks.arrays;

/**
 *
 * * int[][] arr = new int[3][4] => 3 row 4 col
 *
 * [0][0] [0][1] [0][2] [0][3]
 * [1][0] [1][1] [1][2] [1][3]
 * [2][0] [2][1] [2][2] [2][3]
 *
 */

public class WavePrint {
    public static void main(String[] args) {
        int arr[][] = { {2,3,5,1,7}, {8,9,11,12,14},{15,16,18,20,21}}; //3X5
        print(arr);
    }
    public static void print(int[][] arr){
        for (int col=0; col<arr[0].length; col++){
            if (col%2==0) {
                for(int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            else {
                for(int row = arr.length - 1; row >=0 ; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }

        }
    }
}
