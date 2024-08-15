package org.codingblocks.assignment.assignment3;

import java.util.Arrays;

/***
 * INPUT :
 * 9
 * 5, 7, 9, 1, 2, 4, 6, 8, 3
 * 10
 *
 * OUTPUT :
 * 1, 2 and 7
 * 1, 3 and 6
 * 1, 4 and 5
 * 2, 3 and 5
 *
 */
public class ArraysTargetSumTriplets {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int target = sc.nextInt();
//        triplets(arr, target);
        int arr2[] = {5, 7, 9, 1, 2, 4, 6, 8, 3};
        triplets(arr2,10);
        System.out.println(Arrays.toString(arr2));

    }

    //Brute force approach
    public static void triplets(int[] arr, int target) {
        sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                    }
                }
            }
        }
    }

    public static void triplets2(int[] arr, int target) {
        sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j=i+1;
            int k=n-1;
//            while ()
        }
    }

    //optimized bubble sort
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            int swap = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;
                }
            }
            if (swap == 0) break;
        }
    }

}
