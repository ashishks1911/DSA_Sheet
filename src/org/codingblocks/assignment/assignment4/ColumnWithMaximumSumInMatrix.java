package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class ColumnWithMaximumSumInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        maxSumColumn(arr);

    }
    public static void maxSumColumn(int arr[][]){
        int maxSum = 0;
        int idx = -1;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[0].length; j++){
                sum+= arr[j][i];
            }
            if(sum>maxSum){
                maxSum = sum;
                idx = i;
            }
        }
        System.out.println((idx+1)+" "+maxSum);
    }
}

