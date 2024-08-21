package org.codingblocks.arrays;

/**
 *
 * * int[][] arr = new int[3][4] => 3 row 4 col
 *
 * [00] [01] [02] [03]
 * [10] [11] [12] [13]      =>   [00][10][20][21][11][01][02][12][22][23][13][03]
 * [20] [21] [22] [23]
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
