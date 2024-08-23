package org.ashish.hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Minimum number of operations to make all the elements equal in the array.
 * Links :
 * https://www.geeksforgeeks.org/find-the-minimum-number-of-operations-required-to-make-all-array-elements-equal/
 * To do : Equalize an array in minimum operations
 *
 */
public class _2_MinimumOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }


    }

    // https://www.geeksforgeeks.org/minimum-operation-make-elements-equal-array/
    public static int minimumOperations(int[] arr){
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int e : arr){
            freq.put(e,freq.getOrDefault(e,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (int e : arr){
            max = Math.max(freq.get(e),max);
        }
        return arr.length - max;
    }

}


