package org.codingblocks.sorting;

/***
 *
 * https://leetcode.com/problems/maximum-subarray/
 *
 * Subarray : Contagious part of the array
 * Subsequence : Any part of the array
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -7, 5, -1, 8};
        System.out.println(maximumSum(arr));
    }

    //Brute Force Approach
    public static int maximumSumSubarray(int []arr){
        int ans = Integer.MIN_VALUE;

        //Generating all the sub arrays...
        for (int i=0; i<arr.length; i++){
            int sum=0;
            for (int j=i; j<arr.length; j++){
                sum += arr[j];
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
    //Kadane's Algorithm
    public static int maximumSum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
            ans = Math.max(ans,sum);
            if (sum<0)
                sum=0;
        }
        return ans;
    }

}
