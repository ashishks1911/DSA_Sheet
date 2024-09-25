package org.codingblocks.assignment.assignment3;

import java.util.Arrays;
import java.util.Scanner;

/***
 * https://hack.codingblocks.com/app/contests/6435/61/problem
 * */
public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int x = sc.nextInt();
            int temp[] = arr.clone();
            rotate(arr, x);
            for (int j = 0; j < n; j++) {
                arr[j] = arr[j] + temp[j];
            }
            System.out.println(Arrays.toString(arr));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int ans = sum % (int) (Math.pow(10, 9) + 7);
        System.out.println(ans);
    }

    public static void rotate(int[] arr, int x) {
        int n = arr.length;
        reverse(arr, 0, n - x - 1);
        reverse(arr, n - x, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
