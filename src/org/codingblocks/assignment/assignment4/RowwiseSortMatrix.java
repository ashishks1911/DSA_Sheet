package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class RowwiseSortMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sortMatrix(arr);
        display(arr);
    }
    public static void sortMatrix(int[][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                for (int k=0; k<arr[i].length-j-1; k++){
                    if (arr[i][k]>arr[i][k+1]){
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k+1];
                        arr[i][k+1] = temp;
                    }
                }
            }
        }
    }

    public static void display(int [][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
