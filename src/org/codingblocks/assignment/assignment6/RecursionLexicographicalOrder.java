package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class RecursionLexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n, 0);
    }

    public static void print(int n, int curr) {
        if (curr > n) {
            return;
        }
        System.out.print(curr + " ");
        int i = 0;
        if (curr == 0) {
            i = 1;
        }
        while (i <= 9) {
            print(n, curr * 10 + i);
            i++;
        }
    }
}
