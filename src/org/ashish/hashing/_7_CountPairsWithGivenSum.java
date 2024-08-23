package org.ashish.hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/count-pairs-with-given-sum/
 */
public class _7_CountPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(bruteForce(arr, x));
        System.out.println(hashingSolution(arr,x));
    }

    public static int bruteForce(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x)
                    count++;
            }
        }
        return count;
    }

    /*
           T.C = O(N)
           S.C = O(N)
     */
    public static int hashingSolution(int arr[], int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(x - arr[i])) {
                count += map.get(x - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return count;
    }
}
