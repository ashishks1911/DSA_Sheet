package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class ArraysLinearSearch {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        System.out.println(linearSearch(arr,M));
    }

    public static int linearSearch(int[] arr, int M){
        for (int i=0; i<arr.length; i++){
            if (M==arr[i])
                return i;
        }
        return -1;
    }
}
