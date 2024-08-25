package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class TransponseOfASquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        transpose(arr);
        display(arr);
    }

    public static void transpose(int [][]arr){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] =temp;
            }
        }
    }

    public static void display(int [][]arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
