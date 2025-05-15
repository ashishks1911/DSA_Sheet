package org.codingblocks.dp.part4;

public class Wine {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4};
        System.out.println(maximumProfit(arr, 0, arr.length-1, 1));
    }

    public static int maximumProfitBU(int[] arr) {
        int dp[][] = new int[arr.length][arr.length];
        int year = arr.length;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = arr[i]*year;
        }
        year--;
        for (int gap = 0; gap < dp.length; gap++) {
            for (int j = gap; j < dp.length; j++) {
                int i = j-gap;
                int first = arr[i]*year + dp[i+1][j];
                int last = arr[j]*year + dp[i][j-1];
                dp[i][j] = Math.max(first, last);
            }
            year--;
        }
        return dp[0][dp[0].length];
    }

    public static int maximumProfit(int[] arr, int i, int j, int year) {
        if (i>j){
            return 0;
        }
        int first = arr[i]*year + maximumProfit(arr, i+1, j, year+1);
        int last = arr[j]*year + maximumProfit(arr, i, j-1, year+1);
        return Math.max(first, last);
    }
}
