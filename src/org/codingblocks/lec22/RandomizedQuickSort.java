package org.codingblocks.lec22;

import java.util.Arrays;
import java.util.Random;

public class RandomizedQuickSort {
    public static void main(String[] args) {
        int arr[] = {5, 7, 2, 1, 8, 3, 4};
        sort(arr, 0, arr.length - 1);
        System.out.println(partition(arr, 0, arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int idx = partition(arr, si, ei);
        sort(arr, si, idx - 1);
        sort(arr, idx + 1, ei);

    }

    public static int partition(int[] arr, int si, int ei) {
        Random rn = new Random();
        int ri = rn.nextInt(ei - si) + si;
        swap(arr, ei, ri);
        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                swap(arr, idx, i);
                idx++;
            }
        }
        swap(arr, idx, ei);
        return idx;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
