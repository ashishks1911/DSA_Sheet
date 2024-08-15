package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n-1;
        int row = 1;
        while(row<=n){
            int i=1;
            while (i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while (j<=n){
                if (row>1 && row<n && j>1 && j<n) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
                j++;
            }
            space--;
            row++;
            System.out.println();
        }
    }
}
