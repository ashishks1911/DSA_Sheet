package org.codingblocks.lec33;

/**
 * https://leetcode.com/problems/subarray-product-less-than-k/description/
 */
public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2};
        int k = 10;
        count(arr, k);
    }

    public static int count(int[] nums, int k) {
        int count = 0, si = 0, ei = 0, p = 1;
        while (ei < nums.length) {
            //grow
            p = p * nums[ei];
            //shrink
            while (p >= k) {
                p = p / nums[si];
                si++;
            }
            //ans update
            count += (ei - si + 1);
            ei++;
        }
        return count;
    }

}
