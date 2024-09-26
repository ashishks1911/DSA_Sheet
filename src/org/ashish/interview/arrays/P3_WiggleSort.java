package org.ashish.interview.arrays;

import java.util.Arrays;

/**
 * https://www.naukri.com/code360/problem-details/wiggle-sort_3155169
 * <p>
 * ARR[0] ≤ ARR[1] ≥ ARR[2] ≤ ARR[3] ≥ ARR[4] ≤ ARR[5] ...
 * <p>
 * Example :
 * Input : [1 2 3 4 5]
 * Output : [1 4 2 5 3]
 */
public class P3_WiggleSort {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        wiggleSort(nums);
    }

    public static void wiggleSort(int[] arr) {
        Arrays.sort(arr);
        int i = 2;
        while (i < arr.length) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            i = i + 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void wiggleSortEfficient(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (arr[i + 1] < arr[i]) {
                    //swap
                    swap(arr,i+1,i);
                }
            } else {
                if (arr[i + 1] > arr[i]) {
                    //swap
                    swap(arr,i+1,i);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
