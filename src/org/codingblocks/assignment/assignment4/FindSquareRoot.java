package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(squareRoot(2));

    }

    public static long squareRoot(long x) {
        long lo = 0, hi = x;
        long ans = 0;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (mid * mid <= x) {
                ans=mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
