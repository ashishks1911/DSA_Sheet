package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class OddEvenUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 != 0)
            System.out.println(n);
        print(n - 1);
        if (n % 2 == 0)
            System.out.println(n);
    }
}
