package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class MommyMotivationalSpeech {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
//        upperTriangular();
        System.out.println(isLowerTriangular(arr));
    }

    /**
     * Lower triangular matrix : if all the elements above diagonal are zero.
     *
     * [00][01][02][03]         [01][02][03]
     * [10][11][12][13]     =>      [12][13]
     * [20][21][22][23]                 [23]
     * [30][31][32][33]
     *
     * Upper triangular matrix : if all the elements below diagonal are zero.
     * @param arr
     * @return
     */
    public static boolean isLowerTriangular(int [][]arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr[0].length; j++){
                System.out.println(i+":"+j);
                if (arr[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void upperTriangular(int [][]arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr[0].length; j++){
                arr[j][i] = 0;
            }
        }
    }
}
