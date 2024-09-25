package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 * nums[] = [8, -8 , 9, -9, 10, -11, 12], n=7
 * <p>
 * next  = (i+1)%n;
 * prev = (i-1+n)%n
 */
public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(maxCircularSum(arr));
            t--;
        }
    }

    public static int maxCircularSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int curMax = 0;
        int curMin = 0;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curMax = Math.max(curMax + arr[i], arr[i]);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + arr[i], arr[i]);
            minSum = Math.min(curMin, minSum);
            totalSum += arr[i];
        }
        if (maxSum > 0)
            return Math.max(maxSum, totalSum - minSum);
        else
            return maxSum;
    }

    public static int maxCircularSubArraySum(int[] arr) {
        int linearKd = kadanes(arr);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = -arr[i];   //negate
        }

        int invertedKd = kadanes(arr);
        return Math.max(linearKd, sum + invertedKd);
    }

    public static int kadanes(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(sum, max);
            if (sum < 0)
                sum = 0;
        }
        return max;
    }


}
