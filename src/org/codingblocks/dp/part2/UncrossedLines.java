package org.codingblocks.dp.part2;

public class UncrossedLines {
    public static void main(String[] args) {
        int[] num1 = {1, 4, 2};
        int[] num2 = {1, 2, 4};
        System.out.println(maxUncrossedLines(num1, num2));
    }

    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (nums1[i - 1] == nums2[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else {
                    int f = dp[i - 1][j];
                    int s = dp[i][j - 1];
                    dp[i][j] = Math.max(f, s);
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}
