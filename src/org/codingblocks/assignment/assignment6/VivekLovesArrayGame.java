package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class VivekLovesArrayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = pointScored(arr, 0, n - 1);
            System.out.println(max);

        }
    }

    public static int pointScored(int[] arr, int start, int end) {
        int totalSum = 0;
        for (int i = start; i <= end; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = start; i < end; i++) {
            leftSum += arr[i];
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                int left = pointScored(arr, start, i);
                int right = pointScored(arr, i + 1, end);
                return 1 + Math.max(left, right);
            }
        }
        return 0;
    }

}
