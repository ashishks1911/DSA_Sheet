package org.codingblocks.arrays;

import java.util.Arrays;

/***
 *
 * Problem : https://leetcode.com/problems/rotate-array/description/
 * Solution :
 *   Observation :  periodic function
 *   Solved by Reversal algorithm
 *
 *
 */
public class RotateArray {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray2(arr,3)));

//        int arr2[] = {-1, -100, 3, 99};
//        System.out.println(Arrays.toString(rotateArray2(arr2,2)));
    }

    //Brute force approach
    public static int[] rotateArray(int []arr, int k){
        int n =arr.length;
        k = k%n;
        for (int j=1; j<=k; j++) {
            // for 1 rotation
            int item = arr[n-1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = item;
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    //Using Reversal algorithm
    public static int[] rotateArray2(int []arr, int k){
        int n =arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    public static void reverse(int[] arr, int l, int r){
        while (l<r){
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
}
