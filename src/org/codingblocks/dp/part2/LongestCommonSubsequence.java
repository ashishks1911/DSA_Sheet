package org.codingblocks.dp.part2;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int[][] dp = new int[s1.length()][s2.length()];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        lcsTD(s1, s2, 0, 0, dp);
        lcsBU(s1,s2);

    }

    public static int lcs(String s1, String s2, int i, int j) {
        if (i == s1.length() || j == s2.length())
            return 0;
        if (s1.charAt(i) == s2.charAt(j))
            return 1 + lcs(s1, s2, i + 1, j + 1);
        else {
            int fc = lcs(s1, s2, i + 1, j);       // first choice
            int sc = lcs(s1, s2, i, j + 1);       // Second choice
            return Math.max(fc, sc);
        }
    }

    public static int lcsTD(String s1, String s2, int i, int j, int[][] dp) {
        if (i == s1.length() || j == s2.length())
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (s1.charAt(i) == s2.charAt(j))
            return dp[i][j] = 1 + lcsTD(s1, s2, i + 1, j + 1, dp);
        else {
            int fc = lcsTD(s1, s2, i + 1, j, dp);       // first choice
            int sc = lcsTD(s1, s2, i, j + 1, dp);       // Second choice
            return dp[i][j] = Math.max(fc, sc);
        }
    }

    public static int lcsBU(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                System.out.println(s1.charAt(i - 1) +" : " + s2.charAt(j - 1));
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1]+1;
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
