package org.codingblocks.assignment.assignment4;

public class ArraysSpiralPrintClockwise {
    public static void main(String[] args) {
        int arr[][] = {
                {11, 12, 13},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43}
        };
        spiralPrint(arr);
    }
    public static void spiralPrint(int[][] arr) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int te = arr.length * arr[0].length;
        while (te>0) {
            for (int i = minc; i <= maxc && te!=0; i++) {
                System.out.print(arr[minr][i] + ", ");
                te--;
            }
            minr++;
            for (int i = minr; i <= maxr && te!=0; i++) {
                System.out.print(arr[i][maxc] + ", ");
                te--;
            }
            maxc--;
            for (int i = maxc; i >= minc && te!=0; i--) {
                System.out.print(arr[maxr][i] + ", ");
                te--;
            }
            maxr--;
            for (int i = maxr; i >= minr && te!=0; i--) {
                System.out.print(arr[i][minc]+", ");
                te--;
            }
            minc++;
        }
        System.out.print("END");
    }
}
