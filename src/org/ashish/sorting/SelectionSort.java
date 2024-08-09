package org.ashish.sorting;

import java.util.Arrays;

/**
 * select the minimum and swap
 *
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, -1, 5, 3, -2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]){
        int n = arr.length;
        for (int i=0; i<=n-2; i++){
            int mini = i;
            //Select the minimum
            for (int j=i+1; j<=n-1; j++){
                if (arr[j]<arr[mini]){
                    mini=j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i]= arr[mini];
            arr[mini] = temp;
        }
    }

    public static void selectionSort(int []arr){
        for (int i=0; i<arr.length-1; i++){
            int min = minimumIndex(arr,i);
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]=temp;
        }
    }

    public static int minimumIndex(int []arr, int i){
        int mini=i;
        for (int j=i+1; j<arr.length; j++){
            if (arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }

}
