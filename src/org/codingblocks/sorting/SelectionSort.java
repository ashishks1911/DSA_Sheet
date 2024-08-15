package org.codingblocks.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, -1, 5, 3, -2, 1};
        System.out.println(min_form_ith_index(arr,1));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int mini = min_form_ith_index(arr,i);
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    public static int min_form_ith_index(int[] arr, int i){
        int min = i;
        for (int j=i+1; j<arr.length; j++){
            if (arr[j]<arr[min]){
                min=j;
            }
        }
        return min;
    }
}
