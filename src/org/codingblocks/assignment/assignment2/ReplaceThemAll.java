package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
//        System.out.println(replaceThemAll2(n));
        replaceThemAll(n);
    }

    public static void replaceThemAll(long n) {
        long num = n;
        long mul = 1;
        while (n != 0) {
            long rem = n % 10;
            System.out.println("before:"+num);
            if (rem == 0) {
                num += 5 * mul;
            }
            System.out.println("after :"+num);
            mul *= 10;
            n /= 10;
        }
        if (num != 0)
            System.out.println(num);
        else
            System.out.println(5);
    }

    public static long replaceThemAll2(long N) {
        long multiplier = 1;
        long result = 0;
        while (N > 0) {
            // extract the last digit
            int digit = (int) (N % 10);
            // replacement of digits
            if (digit == 0) {
                digit = 5;
            }
            // build new number
            result += digit * multiplier;
            multiplier *= 10;
            System.out.println(result);
            // remove last digit from original number
            N /= 10;
        }
        return result;

    }
}
