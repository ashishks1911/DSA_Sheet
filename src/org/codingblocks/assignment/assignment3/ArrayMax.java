package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(max(arr));
    }
    public static int max(int[] arr){
        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
