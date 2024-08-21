package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

/**
 * Assignment : https://hack.codingblocks.com/app/contests/6477
 * Example :
 * 4 4
 * 11 12 13 14              [00][01][02][03]
 * 21 22 23 24      =>      [10][11][12][13]   
 * 31 32 33 34              [20][21][22][23]
 * 41 42 43 44              [30][31][32][33]
 *
 */
public class ArraysWavePrintColumnWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        int ex[][] = {
//                {11, 12, 13, 14},
//                {21, 22, 23, 24},
//                {31, 32, 33, 34},
//                {41, 42, 43, 44}
//        };
        wavePrintColumnWise(arr);

    }

    public static void wavePrintColumnWise(int arr[][]){
        for (int col=0; col<arr.length; col++){
            if (col%2==0) {
                for (int row = 0; row < arr[0].length; row++) {
                    System.out.print(arr[row][col]+", ");
                }
            }else{
                for (int row = arr[0].length-1; row>=0; row--){
                    System.out.print(arr[row][col]+", ");
                }
            }
        }
        System.out.print("END");
    }

}
