package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class ArraysSpiralPrintAnticlockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        int arr[][] = {
//                {11, 12, 13, 14},
//                {21, 22, 23, 24},
//                {31, 32, 33, 34},
//                {41, 42, 43, 44}
//        };
        spiralPrint(arr);

    }

    public static void spiralPrint(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int te = arr.length * arr[0].length;
        while (te>0) {
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][minc] + ", ");
                te--;
            }
            minc++;
            for (int i = minc; i <= maxc; i++) {
                System.out.print(arr[maxr][i] + ", ");
                te--;
            }
            maxr--;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][maxc] + ", ");
                te--;
            }
            maxc--;
            for (int i = maxc; i >= minc; i--) {
                System.out.print(arr[minr][i]+", ");
                te--;
            }
            minr++;
        }
        System.out.print("END");
    }

}
