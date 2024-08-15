package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        System.out.println(fibonacci2(n));
    }

    public static int fibonacci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }


    public static int fibonacci2(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        int n1=0, n2=1, fib=0;
        for (int i=2; i<=n; i++){
            fib = n1+n2;
            n1=n2;
            n2=fib;
        }
        return fib;
    }
}


/****
 * Question:
 * Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.
 *
 * Input Format
 * Constraints
 * 0 <= N <= 1000
 *
 * Output Format
 * Sample Input
 * 10
 * Sample Output
 * 55
 * Explanation
 * The 0th fibonnaci is 0 and 1st fibonnaci is 1.
 *
 */