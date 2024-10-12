package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class NthTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthTriangle(1, n));
    }
    public static int nthTriangle(int i, int n) {
        if (i == n) {
            return n;
        }
        return i + nthTriangle(i + 1, n);
    }
}
