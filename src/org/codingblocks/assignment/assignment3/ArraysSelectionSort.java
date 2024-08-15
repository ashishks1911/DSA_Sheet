package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class ArraysSelectionSort {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mini = minimum(arr, i);
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }

    }

    public static int minimum(int[] arr, int i) {
        int mini = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[mini])
                mini = j;
        }
        return mini;
    }
}
