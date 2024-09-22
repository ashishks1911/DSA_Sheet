package org.codingblocks.assignment.assignment1;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 * Assignment on Patterns
 *
 */

import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int row=1;
        int num=1;
        int val=0;
        while (row<=n){
            int i=1;
            while (i<=star){
                System.out.print(val+"\t");
                int temp =val +num;
                val=num;
                num=temp;
                i++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
