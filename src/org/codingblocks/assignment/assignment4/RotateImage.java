package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][N];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        anticlockwise90degrees(arr);
        display(arr);
    }

    public static void anticlockwise90degrees(int [][]arr){
        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // reversing rows
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            for (int col=0; col<arr[0].length; col++){
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col]=temp;
            }
            i++;
            j--;
        }
    }

    public static void display(int [][]arr){
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
