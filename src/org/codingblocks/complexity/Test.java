package org.codingblocks.complexity;

import java.util.Scanner;

/**
 * Time and Space Complexity
 * <p>
 * Type of time complexity
 * Asymptotic notation Vs Experimental notation
 * 1. Experimental notation : depends on hardware
 * <p>
 * Asymptotic notation :
 * 1. Worst case
 * 2. Best case
 * 3. Average case
 * <p>
 * Points to remember
 * Worst case  case of bubble, selection and insertion sort is O(n^2);
 * <p>
 * Among bubble, selection and insertion sort : Minimum swaping occurs in selection sort
 * insertion sort best case time complexity O(n) . Reason ?
 */
public class Test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {

        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        int n = 5;
        int i = 0;
        while (i <= n) {
            System.out.println("Hey");
            // O(logN)  base 2
            i *= 2;
        }

        while (n > 0) {
            System.out.println("Hey");
            // O(logN)  base 2
            n /= 2;
        }

        while (i <= n) {
            System.out.println("Hey");
            // O(N)
            i += 2;
            i += 3;
        }

        while (i <= n) {
            System.out.println("Hey");
            // O(logN)  base 6
            i *= 2;
            i *= 3;
        }

        while (n > 0) {
            System.out.println("Hey");
            // O(logN)  base 6
            n /= 2;
            n /= 3;
        }

        int k = 2;
        while (i <= n) {
            System.out.println("Hey");
            //O(N/k)
            i += k;
        }

        while (i <= n) {
            System.out.println("Hey");
            // O(logN) base k
            i *= k;
        }

        while (n > 0) {
            System.out.println("Hey");
            //O(N)
            n = n - 1;
        }

        while (n > 0) {
            System.out.println("Hey");
            //N/5 => O(N)
            n = n - 2;
            n = n - 3;
        }

        while (n > 0) {
            //O(N/k)
            n = n - k;
        }

        for (int j = 0; j * j <= n; j++) {
            //O(sqrt(n))
            System.out.println("Hey");
        }
    }

    public static void m1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for (int j = 1; j <= q; j++) {
            int A = sc.nextInt();
            int k = sc.nextInt();

            for (int m = 0; m < arr.length; m++) {
                if (A % arr[m] == 0) {
                    count++;

                }
            }
            if (count >= k) {
                System.out.println("Yes");

            } else {
                System.out.println("No");
            }

        }


    }

}
