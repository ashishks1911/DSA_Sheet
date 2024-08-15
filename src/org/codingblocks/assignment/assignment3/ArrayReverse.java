package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        reverse(arr);
        for (int i : arr){
            System.out.println(i);
        }

    }
    // Example :    0 4 6 8 9 => 9 8 6 4 0
    public static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
