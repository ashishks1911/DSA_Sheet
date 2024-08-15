package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star=1;
        int space=2*n-3;
        int row =1;
        while (row<=n){
            int i=1;
            while (i<=star){
                System.out.print(i+"\t");
                i++;
            }
            int j=1;
            while (j<=space){
                System.out.print("\t");
                j++;
            }
            int k=row;
            if (row==n){
                k--;
            }
            while (1<=k){
                System.out.print(k+"\t");
                k--;
            }
            space-=2;
            row++;
            star++;
            System.out.println();
        }
    }
}
