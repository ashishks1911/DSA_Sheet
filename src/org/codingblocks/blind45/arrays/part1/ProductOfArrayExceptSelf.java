package org.codingblocks.blind45.arrays.part1;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductOfArrayExceptSelf {
    public static int[] product(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        pre[0] = 1;
        suf[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = nums[i - 1] * pre[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            suf[i] = nums[i + 1] * suf[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            pre[i] = pre[i] * suf[i];
        }
        return pre;

    }
}
