package org.codingblocks.lec22;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 2, 1, 8, 3, 4};
        sort(arr, 0, arr.length - 1);
        System.out.println(partition(arr,0,arr.length-1));
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int si, int ei) {
        if (si>=ei){
            return;
        }
        System.out.println(Arrays.toString(arr) +", "+ si +" : "+ ei);
        int idx = partition(arr, si, ei);
        sort(arr, si, idx - 1);
        System.out.println(Arrays.toString(arr) +", "+ si +" : "+ ei);
        sort(arr, idx + 1, ei);
        System.out.println(Arrays.toString(arr) +", "+ si +" : "+ ei);

    }

    public static int partition(int[] arr, int si, int ei) {
        int item = arr[ei];  //for last index
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
                idx++;
            }
        }
        int temp = arr[idx];
        arr[idx] = arr[ei];
        arr[ei] = temp;
        return idx;
    }
}
