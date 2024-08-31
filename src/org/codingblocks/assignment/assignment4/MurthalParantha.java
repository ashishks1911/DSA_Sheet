package org.codingblocks.assignment.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class MurthalParantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();   //no. of parantha ordered
        int l = sc.nextInt();   //no. of cooks
        int rank[] = new int[l];   //rank of each cook
        for (int i = 0; i < l; i++) {
            rank[i] = sc.nextInt();
        }
        System.out.println(binarySearch(rank, p));
    }

    public static long binarySearch(int[] rank, int parantha) {
        int lo = 0;
        int ans = 0;
        int hi = Integer.MAX_VALUE;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isItPossible(rank, parantha, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    /**
     * time taken by cook with R rank
     * R + 2R + 3R + 4R + .......nR    =>  R * (1+2+3+4+....n)
     * =>  R * (n * (n+1)/2)
     * given time >= R * (n*(n+1)/2)
     * (2*given time)/ R >= n*(n+1)
     */
    public static boolean isItPossible(int[] rank, int parantha, int minTime) {
        for (int i = 0; i < rank.length; i++) {
            int t = 0;
            int ct = 1;     // no. of parantha
            while (t + ct * rank[i] <= minTime && parantha > 0) {
                t += ct * rank[i];
                ct++;
                parantha--;
            }
            if (parantha == 0)
                return true;
        }
        return false;
    }

    public static int timeNeeded(int[] rank, int parantha) {
        int[] timeArr = rank.clone();
        int prefix[] = rank.clone();
        while (parantha != 0) {
            System.out.println(Arrays.toString(prefix));
            int mini = minimumTime(prefix);
            for (int j = 0; j < rank.length; j++) {
                if (mini == prefix[j]) {
                    parantha--;
                    timeArr[j] += rank[j];
                    prefix[j] += timeArr[j];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(timeArr));
        System.out.println(Arrays.toString(prefix));

        for (int i = 0; i < rank.length; i++) {
            prefix[i] -= timeArr[i];
        }
        System.out.println(Arrays.toString(prefix));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            if (prefix[i] > max) {
                max = prefix[i];
            }
        }
        return max;
    }

    public static int minimumTime(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
