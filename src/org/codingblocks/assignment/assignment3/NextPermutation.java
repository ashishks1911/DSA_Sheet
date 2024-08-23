package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 * Input :
 * 2
 * 3
 * 1 2 3
 * 3
 * 3 2 1
 *
 * Output :
 * 1 3 2
 * 1 2 3
 *
 */
public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int digits[] = new int[n];
            for (int i = 0; i < n; i++) {
                digits[i] = sc.nextInt();
            }
            nextPermutation(digits);
            for (int e : digits) {
                System.out.print(e + " ");
            }
            System.out.println();
            t--;
        }

    }

    public static void nextPermutation(int[] arr) {
        int idx1 = -1;      //find the break point
        int idx2 = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                idx1 = i;
                break;
            }
        }

        if (idx1 == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        } else {
            for (int i = arr.length - 1; i > idx1; i--) {
                if (arr[i] > arr[idx1]) {
                    idx2 = i;
                    break;
                }
            }

            swap(arr, idx1, idx2);
            reverse(arr, idx1 + 1, arr.length - 1);
        }
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
