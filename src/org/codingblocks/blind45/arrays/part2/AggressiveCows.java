package org.codingblocks.blind45.arrays.part2;

import java.util.Arrays;

/**
 * https://www.spoj.com/problems/AGGRCOW/
 * <p>
 * To Find the largest minimum distance
 */
public class AggressiveCows {
    public static void main(String[] args) {
        int n = 5;      //no. of stalls
        int[] stalls = {1, 2, 8, 4, 9};     // stall location
        int c = 3;      //  no. of cows

        //minimum distance will always exist b/w consecutive stalls : sort
        Arrays.sort(stalls);
        System.out.println(bruteForce(n, stalls, c));
        System.out.println(binarySearch(n, stalls, c));


    }

    public static int binarySearch(int n, int[] stalls, int noOfCows) {
        int low = 1, high = stalls[n - 1] - stalls[0];
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canWePlace(stalls, mid, noOfCows)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static int bruteForce(int n, int[] stalls, int noOfCows) {
        int maxDist = stalls[n - 1] - stalls[0];
        int minDist = 0;
        for (int i = 1; i < maxDist; i++) {
            if (!canWePlace(stalls, i, noOfCows)) {
                break;
            }
            minDist++;
        }
        return minDist;
    }

    public static boolean canWePlace(int[] stalls, int dist, int noOfCows) {
        int cowPlaced = 1, last = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= dist) {
                last = stalls[i];
                cowPlaced++;
            }

            if (cowPlaced >= noOfCows) {
                return true;
            }
        }
        return false;
    }

}
