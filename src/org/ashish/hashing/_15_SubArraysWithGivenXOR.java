package org.ashish.hashing;

import java.util.HashMap;

/**
 * https://www.interviewbit.com/problems/subarray-with-given-xor/
 */
public class _15_SubArraysWithGivenXOR {
    public static void main(String[] args) {
        int[] nums = {4, 2, 2, 6, 4};
//        System.out.println(bruteForce(nums,6));
        System.out.println(hashingSolution(nums,6));

    }

    public static int bruteForce(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor ^= arr[j];
                if (xor == k) {
                    count++;

                    //---To print the pairs with given xor
                    System.out.print("[");
                    int start = i;
                    while (start < j) {
                        System.out.print(arr[start] + " ");
                        start++;
                    }
                    System.out.println(arr[start] + "]");
                }
            }
        }
        return count;
    }

    public static int hashingSolution(int arr[], int k) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int xor = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
            if (xor == k) {
                count++;
            }
            count += hmap.getOrDefault(xor ^ k, 0);
            hmap.put(xor, hmap.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}
