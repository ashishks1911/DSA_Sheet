package org.codingblocks.recursion.lec21;

import java.util.Arrays;

public class PartitionInArray {
    public static void main(String[] args) {
        int arr[] = {5, 7, 2, 1, 8, 3, 4};
        int idx = partition(arr, 0, arr.length - 1);
        System.out.println(idx);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Given an array : Arrange the last element in such a way that elements lesser than it
     * will fall on left side and the elements greater than it are on the right side.
     * T.C constraint : O(n)                //  Arrays.sort => nlogn
     *
     * @param arr
     * @param si start index of arr
     * @param ei end index of arr
     * @return
     */
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
