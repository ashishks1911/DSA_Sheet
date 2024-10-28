package org.codingblocks.lec33;

/**
 * Sliding window
 * 1. Fixed size window
 * 2. Variable size window
 */
public class MaximumSumOfWindowSizeK {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7, 1, 4, 5, 6};
        int k = 3;
        System.out.println(maximumSize(arr, k));
    }

    //fixed size window
    public static int maximumSize(int arr[], int k) {
        int sum = 0, ans = 0;

        //Step 1: 1st window answer
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        ans = sum;
        //Step 2:
        for (int i = k; i < arr.length; i++) {
            //grow window
            sum += arr[i];
            //shrink window
            sum -= arr[i - k];
            //ans update
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
