package org.ashish.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  Takes an element and place it in its correct position
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {13, 42, 27, 52, 9, 11, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void input(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void sort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
    }

    public static void insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            insertAndSort(arr,i);
        }
    }
    public static void insertAndSort(int[] arr, int i){
        int item = arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>item){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = item;
    }


}
