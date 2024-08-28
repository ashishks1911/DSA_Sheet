package org.codingblocks.assignment.assignment4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * find (min distance b/w cows) is Maximum ?
 */
public class AggressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //no. of stalls
        int C = sc.nextInt();   //no. of cows
        int[] stall = new int[N];
        for (int i = 0; i < stall.length; i++) {
            stall[i] = sc.nextInt();
        }
        System.out.println(aggressiveCows(stall, C));
    }

    public static int bruteForce(int[] stall, int cows) {
        Arrays.sort(stall);
        int maxDistance = stall[stall.length - 1] - stall[0];
        for (int i = 1; i <= maxDistance; i++) {
            if (!canWePlaceTheCows(stall, cows, i)) {
                return i - 1;
            }
        }
        return maxDistance;
    }

    public static int aggressiveCows(int[] stall, int cows) {
        Arrays.sort(stall);
        int lo = 1;
        int ans = 0;
        int hi = stall[stall.length - 1] - stall[0];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canWePlaceTheCows(stall, cows, mid)) {
                System.out.println(mid);
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static boolean canWePlaceTheCows(int[] stall, int cows, int dist) {
        int last = stall[0];
        int cowplaced = 1;
        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - last >= dist) {
                cowplaced++;
                last = stall[i];
            }
            if (cowplaced == cows) {
                return true;
            }
        }
        return false;
    }
}
