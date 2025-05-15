package org.codingblocks.dp.part4;

public class LongestIncreasingSubsequenceInNLogN {
    public static void main(String[] args) {
        int[] arr = {0, 8, 4, 2, 12, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(LIS(arr));
    }

    public static int LIS(int[] arr) {
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for (int i = 0; i < arr.length; i++) {
            if (dp[len - 1] < arr[i]) {
                dp[len] = arr[i];
                len++;
            } else {
                int idx = binarySearch(dp, 0, len - 1, arr[i]);
                dp[idx] = arr[i];
            }
        }
        return len;
    }

    public static int binarySearch(int[] dp, int si, int ei, int item) {
        int ans = 0;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (dp[mid] >= item) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }
}
