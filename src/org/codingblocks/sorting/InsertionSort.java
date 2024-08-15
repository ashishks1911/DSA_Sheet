package org.codingblocks.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {1, 2, 7, 8, 9, 11, 5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            insertLastElement(arr,i);
        }
    }

    public static void insertLastElement(int[] arr, int i){
        int item = arr[i];
        int j = i-1;
        while ( j>=0 && arr[j]>item){
            arr[j+1]= arr[j];
            j--;
        }
        arr[j+1]=item;
    }


}
