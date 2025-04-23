package org.codingblocks.dp.part2;

import java.util.Arrays;

public class CoinChangeII {
    public static void main(String[] args) {
        int amount = 4;
        int[] coin = {1, 2, 5};
        int[][] dp = new int[amount + 1][coin.length];
        for (int[] a : dp) {
            Arrays.fill(a, -1);
        }
        coinChangeTD(coin, amount, 0, dp);

    }

    public static int coinChange(int[] coin, int amount, int idx) {
        if (amount == 0)
            return 1;
        if (idx == coin.length)
            return 0;
        int take = 0;
        if (coin[idx] <= amount)
            take = coinChange(coin, amount - coin[idx], idx);
        int notTake = coinChange(coin, amount, idx + 1);
        return take + notTake;
    }

    public static int coinChangeTD(int[] coin, int amount, int idx, int[][] dp) {
        if (amount == 0)
            return 1;
        if (idx == coin.length)
            return 0;
        if (dp[amount][idx] != -1)
            return dp[amount][idx];
        int take = 0;
        if (coin[idx] <= amount)
            take = coinChangeTD(coin, amount - coin[idx], idx, dp);
        int notTake = coinChangeTD(coin, amount, idx + 1, dp);
        return dp[amount][idx] = take + notTake;
    }

    public static int coinChangeBU(int[] coin, int amount, int idx, int[][] dp) {
        if (amount == 0)
            return 1;
        if (idx == coin.length)
            return 0;
        int take = 0;
        if (coin[idx] <= amount)
            take = coinChangeTD(coin, amount - coin[idx], idx, dp);
        int notTake = coinChangeTD(coin, amount, idx + 1, dp);
        return take + notTake;
    }


}
