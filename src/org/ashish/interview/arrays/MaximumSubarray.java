package org.ashish.interview.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int []arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximumSumSubArray(arr));
        System.out.println(kadanesAlgorithm(arr));
    }

    // Brute force approach
    public static int maximumSumSubArray(int[] arr){
        int ans = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            int sum=0;
            for (int j=i; j<arr.length; j++){
                sum+=arr[j];
                ans = Math.max(sum,ans);
            }
        }
        return ans;
    }

    //kadane's algorithm
    public static int kadanesAlgorithm(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
            ans = Math.max(sum,ans);
            if (sum<0)
                sum=0;
        }
        return ans;
    }
}
