package org.codingblocks.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr = {1, 2, 7, 8, 9, 11, 5};
        int []arr2 = {23, 1, 10, 5, 2};
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void insertionSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            insertLastElement(arr,i);
        }
    }

    public static void insertLastElement(int[] arr, int i){
        int item = arr[i];
        int j = i-1;
        System.out.println(Arrays.toString(arr));
        while ( j>=0 && arr[j]>item){
            arr[j+1]= arr[j];
            j--;
        }
        System.out.println(Arrays.toString(arr));
        arr[j+1]=item;
    }


}
