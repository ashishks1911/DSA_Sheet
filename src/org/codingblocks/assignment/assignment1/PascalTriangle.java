package org.codingblocks.assignment.assignment1;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int star=1;
        while (row<=n){
            int i=1;
            while (i<=star){
                int val=nCobinationR(row-1,i-1);
                System.out.print(val+" ");
                i++;
            }
            star++;
            row++;
            System.out.println();
        }
    }

    public static int nCobinationR(int n, int r){
        int ans=1;
        int i=0;
        while (i<r){
            ans = ans*(n-i);
            ans = ans/ (i+1);
            i++;
        }
        return ans;
    }
}
