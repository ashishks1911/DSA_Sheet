package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

public class InvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star =1;
        int row =1;
        int space=2*n-1;
        while (row<=2*n+1){
            int i=1;
            int val=n;
            while (i<=star){
                System.out.print(val+" ");
                i++;
                val--;
            }
            int j=1;
            while (j<=space) {
                System.out.print("  ");
                j++;
            }

            int k=1;
            val++;
            if (row==2*n/2+1) {
                val++;
                k++;
            }
            while (k<=star){
                System.out.print(val+" ");
                k++;
                val++;
            }
            if (row<=2*n/2) {
                space -= 2;
                star++;
            }
            else {
                space += 2;
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
