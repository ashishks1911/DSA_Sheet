package org.ashish.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int n = arr.length;
        for (int i=n-1; i>0; i--){
            for (int j=0; j<i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr){
        for (int turn=1; turn<arr.length; turn++){
            for (int j=0; j<arr.length-turn; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int[] arr){
        int n = arr.length;
        for (int i=n-1; i>0; i--){
            boolean didSwap = false;
            for (int j=0; j<i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                    didSwap = true;
                }
            }
            if (!didSwap) break;
        }
    }

}
