package org.codingblocks.lec22;

import java.util.Arrays;

public class MergeSort {
    private static int[] arr;

    public static void main(String[] args) {
        int arr[] = {7, 5, 1, 4, 3};
        int [] ans = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(ans));
    }
    // space complexity = O(n)
    public static int[] mergeSort(int[] arr, int si, int ei) {
        if (si == ei) {
            int[] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }
        int mid = (si + ei) / 2;
        int[] fa = mergeSort(arr, si, mid);     //fa = first array
        int[] sa = mergeSort(arr, mid, ei);     // sa = second array
        return merge(fa, sa);
    }

    //merge two sorted arrays
    public static int[] merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int ans[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            ans[k++] = arr1[i++];
        }
        while (j < m) {
            ans[k++] = arr2[j++];
        }

        return ans;
    }
}
