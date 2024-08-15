package org.codingblocks.arrays;

/**
 * [0][0] [0][1] [0][2] [0][3]
 * [1][0] [1][1] [1][2] [1][3]
 * [2][0] [2][1] [2][2] [2][3]
 * [3][0] [3][1] [3][2] [3][3]
 * [4][0] [4][1] [4][2] [4][3]
 *
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        print(matrix);
    }

    public static void print(int[][] arr){
        int minr = 0;
        int minc =0;
        int maxr = arr.length-1;
        int maxc = arr[0].length-1;
        int te = arr.length*arr[0].length;
        int c=0;
        while (c<te) {
            for (int i = minc; i <= maxc && c<te; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;
            }
            minr++;
            for (int i = minr; i <= maxr && c<te; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;
            }
            maxc--;

            for (int i = maxc; i >= minc && c<te; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;
            }
            maxr--;
            for (int i = maxr; i >= minr && c<te; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;
            }
            minc++;
        }
    }

}

