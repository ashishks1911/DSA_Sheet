package org.codingblocks.blind45.dp;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int n = nums.length;
        int[] skipFirst = new int[n - 1];
        int[] skipLast = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            skipFirst[i] = nums[i + 1];
            skipLast[i] = nums[i];
        }
        int ans = Math.max(HouseRobber.spaceOptimization(skipFirst), HouseRobber.spaceOptimization(skipLast));
        System.out.println(ans);
    }
}
