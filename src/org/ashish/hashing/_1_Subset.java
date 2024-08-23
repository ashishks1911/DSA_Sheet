package org.ashish.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Check if the given array is a subset of another array (no duplicates)
 */
public class _1_Subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(subsetWithDuplicates(arr1, arr2));

    }

    /**
     * find arr1 is a subset of arr2
     *
     * @param arr1 of size n
     * @param arr2 of size m
     * @return true or false
     * T.C = O(m * n)
     */
    public static boolean bruteForce(int arr1[], int arr2[]) {
        if (arr1.length > arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            boolean check = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    check = true;
                    break;
                }
            }
            if (!check)
                return false;
        }
        return true;
    }

    /**
     * @param arr1
     * @param arr2
     * @return true or false
     * T.C = O(M*logM+N*logM)
     */
    public static boolean SortingAndBinarySearch(int[] arr1, int arr2[]) {
        //sort the arr2
        Arrays.sort(arr2); //MlogM
        for (int i = 0; i < arr1.length; i++) {      //N*logM
            if (!binarySearch(arr2, arr1[i])) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param arr1
     * @param arr2
     * @return true or false
     * T.C = O(M+N)
     */
    public static boolean optimal(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int e : arr2) {     //O(M)
            set.add(e);
        }

        for (int i = 0; i < arr1.length; i++) {      //O(N)
            if (!set.contains(arr1[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Example :
     * 5
     * 11 3 7 1 7
     * 8
     * 11 7 1 13 21 3 7 3
     *
     * (Technically this question is wrong as in mathematics a Set is a collection of distinct elements.)
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean subsetWithDuplicates(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], map.getOrDefault(arr2[i], 0) + 1);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (map.getOrDefault(arr1[i],0)==0) {
                return false;
            }
            map.put(arr1[i], map.get(arr1[i]) - 1);
        }
        return true;
    }


    public static boolean binarySearch(int[] arr, int ele) {
        int l = 0;
        int h = arr.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == ele)
                return true;
            else if (arr[mid] > ele)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return false;
    }


}


