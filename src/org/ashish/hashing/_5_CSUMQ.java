package org.ashish.hashing;

import java.util.Scanner;

/**
 * https://www.spoj.com/problems/CSUMQ/
 * Example :
 * Input:
 * 3
 * 1 4 1
 * 3
 * 1 1
 * 1 2
 * 0 2
 *
 * Output:
 * 4
 * 5
 * 6
 */
public class _5_CSUMQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();   //queries
        int[] prefixSum = prefixSum(arr);
        while (q > 0) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            //sum of each number b/w the range [i,j] (inclusive)
            /*
                Prefix(r) = Prefix(l,r) + Prefix(l-1);
                Prefix(l,r) = Prefix(r) - Prefix(l-1);
             */
            int rangeSum = prefixSum[j] - (i != 0 ? prefixSum[i - 1] : 0);
            System.out.println(rangeSum);
            q--;
        }

    }

    public static int[] prefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];
        int sum = 0;
        for (int k = 0; k < arr.length; k++) {
            sum += arr[k];
            prefixSum[k] = sum;
        }
        return prefixSum;
    }


}
