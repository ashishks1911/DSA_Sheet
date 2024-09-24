package org.codingblocks.assignment.assignment3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/***
 *
 * INPUT :
 * 5
 * 1 3 4 2 5
 * 5
 *
 * OUTPUT :
 *
 * 1 and 4
 * 2 and 3
 *
 */
public class ArraysTargetSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        pairs(arr, target);
        System.out.println("---------------------------");
        targetSumPairs(arr, target);
        System.out.println("---------------------------");
        sumPairs(arr, target);
    }

    //prints all the pairs (not unique)
    public static void pairs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    if (arr[i] < arr[j])
                        System.out.println(arr[i] + " and " + arr[j]);
                    else
                        System.out.println(arr[j] + " and " + arr[i]);
                }
            }
        }
    }


    /**
     * Two pointer approach
     * prints distinct pairs in the array (for unique use set)
     * Ex : [1 5 7 -1 5] , target = 6
     * T.C = O(nlogn)
     *
     * @param arr
     * @param target
     */
    public static void targetSumPairs(int[] arr, int target) {
        Arrays.sort(arr);
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            if (arr[lo] + arr[hi] == target) {
                if (arr[lo] < arr[hi])
                    System.out.println(arr[lo] + " and " + arr[hi]);
                else
                    System.out.println(arr[hi] + " and " + arr[lo]);
                lo++;
                hi--;
            } else if (arr[lo] + arr[hi] > target) {
                hi--;
            } else
                lo++;
        }
    }

    public static void sumPairs(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            int num = target - a;
            if (map.containsKey(num)) {
                if (a < num)
                    System.out.println(a + " and " + num);
                else
                    System.out.println(num + " and " + a);
            }
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
    }
}
