package org.codingblocks.blind45.arrays.part1;

public class RainWaterTrapping {
    public static int bruteForce(int[] height) {
        int trappedWater = 0;
        for (int i = 1; i < height.length - 1; i++) {
            //at each elevation i
            int leftMax = height[i];
            for (int j = i - 1; j >= 0; j--) {
                leftMax = Math.max(height[j], leftMax);
            }
            int rightMax = height[i];
            for (int j = i + 1; j < height.length; j++) {
                rightMax = Math.max(height[j], rightMax);
            }
            trappedWater += Math.min(leftMax, rightMax) - height[i];
        }
        return trappedWater;
    }

    public static int betterApproach(int[] height) {
        int trappedWater = 0;
        int n = height.length;
        int[] prefix = new int[n];
        prefix[0] = height[0];
        for (int i = 1; i < prefix.length - 1; i++) {
            prefix[i] = Math.max(prefix[i - 1], height[i]);
        }

        int[] suffix = new int[n];
        suffix[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], height[i]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            trappedWater += Math.min(prefix[i], suffix[i]) - height[i];
        }
        return trappedWater;
    }
}
