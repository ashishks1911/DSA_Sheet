package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class RecursionTwins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        twins(str, 0);
    }

    public static void twins(String str, int count) {
        if (str.length() < 3) {
            System.out.println(count);
            return;
        }
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(2);
        if (ch1 == ch2)
            count++;
        twins(str.substring(1), count);

    }
}
