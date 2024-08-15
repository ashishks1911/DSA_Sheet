package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 *
 * nums[] = [8, -8 , 9, -9, 10, -11, 12], n=7
 *
 * next  = (i+1)%n;
 * prev = (i-1+n)%n
 *
 *
 *
 */
public class MaximumCircularSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(maxCircularSum(arr));
    }

    public static int maxCircularSum(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sum=0;
        for (int i=0; i<n;i++){
            sum += arr[i];
            max=Math.max(sum,max);
            if (sum<0)
                sum=0;
        }
        return max;
    }
}
