package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 * Example :
 * Input:
 * 4
 * 1 2 3 4
 * Output:
 * 24 12 8 6
 * <p>
 * Logic :
 * [1, 1, 2, 6]
 * [24, 12, 4, 1]
 * <p>
 * Concept Used : Prefix suffix multiplication
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long ans[] = solution(arr);
        for (long e : arr) {
            System.out.print(e + " ");
        }
    }

    //with division
    public static void product(int[] arr) {
        int total = 1;
        for (int i = 0; i < arr.length; i++) {
            total *= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = total / arr[i];
        }
    }

    //without division
    public static long[] solution(int[] arr) {
        int n = arr.length;
        long prefix[] = new long[n];
        long suffix[] = new long[n];
        long ans[] = new long[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = prefix[i] * suffix[i];
        }
        return ans;
    }

}
