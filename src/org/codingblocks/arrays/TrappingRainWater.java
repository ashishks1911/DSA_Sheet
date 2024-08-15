package org.codingblocks.arrays;

/**
 * Problem : https://leetcode.com/problems/trapping-rain-water/description/
 *
 * Concept Used : Prefix Suffix
 *
 * Left Array
 * L[1] = max(L[0],arr[1])
 * L[2] = max(L[1],arr[2])
 * L[3] = max(L[2],arr[3])
 * L[4] = max(L[3],arr[4])
 *
 * Right Array
 * R[7] = arr[n-1]
 * R[6] = max(R[7],arr[6])
 * R[5] = max(R[6],arr[5])
 * R[4] = max(R[5],arr[4])
 * R[3] = max(R[4],arr[3])
 * R[2] = max(R[3],arr[2])
 * R[1] = max(R[2],arr[1])
 *
 * formula used =  min(L[0],R[0])-arr[0]
 *
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(rainWater(arr));
    }

    public static int rainWater(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        left[0]=arr[0];
        for (int i=1; i<left.length; i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }

        int[] right = new int[n];
        right[n-1]= arr[n-1];
        for (int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }

        int sum=0;
        for (int i=0; i<n; i++){
            sum += Math.min(left[i],right[i]) - arr[i];
        }
        return sum;
    }
}
