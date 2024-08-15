package org.codingblocks.assignment.assignment3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * "https://hack.codingblocks.com/app/contests/6435"
 * Example :    5
 *              0 2 4 1 3
 * O/P:         0 3 1 4 2
 *
*/
 public class InverseOfArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        inverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void inverse(int [] arr){
        int []temp = arr.clone();
        for (int i=0; i<arr.length; i++){
            int ele = temp[i];
            arr[ele]=i;
        }
    }
}

