package org.ashish.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/koko-eating-bananas/description/
 */
public class _7_KokoEatingBananas {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int h = sc.nextInt();
//        int piles[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            piles[i] = sc.nextInt();
//        }

        int ex[] = {3, 6, 7, 11};
        int ex1[] = {30, 11, 23, 4, 20};

        System.out.println(bruteForce(ex, 8));
        System.out.println(bruteForce(ex1,5));

        System.out.println("----------------------");
        System.out.println(optimalSolution(ex,8));
        System.out.println(optimalSolution(ex1,5));

    }
    /*
        T.C = O(N * max), max is max value in the array piles
        [max can be 10^9, N can be 10^4] => 10^13 (worst case)
        S.C = O(1)

     */
    public static int bruteForce(int[] piles, int h) {
        int max = maximum(piles);
        for (int k = 1; k <= max; k++) {
            if (canKokoEat(piles.clone(), k, h)) {
                return k;
            }
        }
        return -1;
    }

    public static int optimalSolution(int [] piles, int h){
        int lo = 1;
        int hi = maximum(piles);
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (canKokoEat(piles,mid,h)){
                hi = mid-1;
            }
            else {
                lo = mid+1;
            }
        }
        return lo;
    }
    public static boolean canKokoEat(int[] piles, int k, int h) {
        int i = 0;
        int sum = 0;
        while (i < piles.length) {
            if (piles[i]%k==0)
                sum = sum + (piles[i]/k);
            else
                sum = sum + (piles[i]/k) + 1;
            i++;
        }
        if (sum<=h){
            return true;
        }
        return false;
    }

    public static int maximum(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            max = Math.max(arr[i],max);
        }
        return max;
    }
}
