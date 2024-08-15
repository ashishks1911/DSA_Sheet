package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class ArraysInsertionSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int e : arr) {
            System.out.print(e+" ");
        }
    }

    public static void sort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int item = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>item){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = item;
        }
    }

}
