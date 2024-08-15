package org.codingblocks.arrays;

import java.util.Arrays;

/***
 *
 * Problem : https://leetcode.com/problems/product-of-array-except-self
 *
 * Concept Used : Prefix suffix multiplication
 *  prefix multiplication = []
 *
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4};
        int ans[] =productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] productExceptSelf(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0]=1;
        for (int i=1; i<left.length; i++){
            left[i]= left[i-1]*arr[i-1];
            System.out.println(left[i]+"="+left[i-1]+"*"+arr[i-1]);
        }
        System.out.println("----------Right----------");
        int right[] = new int[n];
        right[n-1] = 1;
        for (int i=n-2; i>=0; i--){
            right[i] = right[i+1]*arr[i+1];
            System.out.println(right[i]+"="+right[i+1]+"*"+arr[i+1]);
        }

        System.out.println(Arrays.toString(right));
        for (int i=0; i<n; i++){
            arr[i]= left[i]*right[i];
        }

        return arr;
    }
}
