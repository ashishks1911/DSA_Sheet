package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

public class PatternWithZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star=1;
        int row=1;
        while (row<=n){
            int i=1;
            while (i<=star){
                if (star>=2 && i==1 || i==star)
                    System.out.print(row+" ");
                else
                    System.out.print("0 ");
                i++;
            }
            star++;
            row++;
            System.out.println();
        }
    }
}
