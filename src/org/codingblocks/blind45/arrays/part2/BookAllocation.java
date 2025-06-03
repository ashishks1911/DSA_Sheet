package org.codingblocks.blind45.arrays.part2;

import java.util.Scanner;

public class BookAllocation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(binarySearch(arr, m));
        }
    }

    public static int binarySearch(int[] arr, int m) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            sum += arr[i];
        }
        int low = max, high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(arr, mid, m)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static boolean isValid(int[] arr, int noOfPages, int m) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= noOfPages) {
                sum += arr[i];
            } else {
                count++;
                sum = arr[i];
            }
            if (count >= m)
                return true;
        }
        return false;
    }
}
