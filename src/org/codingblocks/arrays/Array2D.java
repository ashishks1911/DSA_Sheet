package org.codingblocks.arrays;

import java.util.Scanner;

/**
 * int[][] arr = new int[3][4] => 3 row 4 col
 *
 *  [0][0] [0][1] [0][2] [0][3]
 *  [1][0] [1][1] [1][2] [1][3]
 *  [2][0] [2][1] [2][2] [2][3]
 *
 */
public class Array2D {
    public static void main(String[] args) {
//        int [][]arr = new int[3][4];
//        System.out.println(arr);
//        System.out.println(arr[1]);
//        //row size
//        System.out.println(arr.length);
//        //col size
//        System.out.println(arr[2].length);
//        // value at row 1 and col 2
//        System.out.println(arr[1][2]);
//
//        int[][] kk = new int[3][]; // correct

//        int [][]arr = userInput2DArray();
//        System.out.println("-----------Output------------");
//        display(arr);



    }
    public static int[][] userInput2DArray(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // row
        int m = sc.nextInt(); // col
        int [][] arr = new int[n][m];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
