package org.codingblocks.dp.extra;

public class CoinChangeI {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int min = Integer.MAX_VALUE;
        min = coinCount(coins, amount, 0);
        int ans = min == Integer.MAX_VALUE ? -1 : min;
        System.out.println(ans);
    }

    // Recursive Approach
    public static int coinCount(int[] coins, int amount, int i) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0 || i >= coins.length)
            return Integer.MAX_VALUE;

        int take = Integer.MAX_VALUE;
        if (amount >= coins[i]) {
            take = coinCount(coins, amount - coins[i], i);
            if (take != Integer.MAX_VALUE)
                take++;
        }
        int notTake = coinCount(coins, amount, i + 1);
        return Math.min(take, notTake);

    }

    public static int memoization(int[] coins, int amount, int i, int[][] dp) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0 || i >= coins.length)
            return Integer.MAX_VALUE;

        if (dp[amount][i] != -1) {
            return dp[amount][i];
        }
        int take = Integer.MAX_VALUE;
        if (amount >= coins[i]) {
            take = memoization(coins, amount - coins[i], i, dp);
            if (take != Integer.MAX_VALUE) take++;
        }
        int notTake = memoization(coins, amount, i + 1, dp);
        return dp[amount][i] = Math.min(take, notTake);
    }

    // TODO
    public static int tabulation(int []coins, int amount){
        return 0;
    }
}
