package org.ashish.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/check-given-array-contains-duplicate-elements-within-k-distance/
 */
public class _3_KthDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(bruteForce(arr, k));
    }

    // T.C = O(n * k)
    public static boolean bruteForce(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length && j <= k + i; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* Using hashing
        T.C = O(n)
        S.C = O(n)
     */
    public static boolean betterSolution(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (i - map.get(arr[i]) <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }

    /* Using hashing
        T.C = O(n)
        S.C = O(k)
     */
    public static boolean betterSolution(int[] arr, int n, int k) {
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (hset.contains(arr[i]))
                return true;
            if (i>=k){
                hset.remove(arr[i-k]);
            }
            hset.add(arr[i]);
        }
        return false;
    }
}
