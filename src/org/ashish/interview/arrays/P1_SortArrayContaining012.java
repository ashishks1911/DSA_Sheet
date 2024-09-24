package org.ashish.interview.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/sort-colors/description/
 *
 */
public class P1_SortArrayContaining012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        sortColors(arr);
        dutchNationalFlagAlgorithm(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int zero = 0, one = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            else if (nums[i] == 1)
                one++;
        }

        int i = 0;
        int counter = 0;
        while (counter < zero) {
            nums[i] = 0;
            counter++;
            i++;
        }

        counter = 0;
        while (counter < one) {
            nums[i] = 1;
            counter++;
            i++;
        }

        while (i < nums.length) {
            nums[i] = 2;
            i++;
        }
    }

    //3 pointer algorithm
    public static void dutchNationalFlagAlgorithm(int arr[]) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, lo, mid);
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, hi);
                    hi--;
                    break;
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
