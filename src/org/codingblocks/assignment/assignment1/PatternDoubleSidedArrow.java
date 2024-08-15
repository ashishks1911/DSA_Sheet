package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

public class PatternDoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space1 = n-1;
        int space2= -1;
        int star =1;
        int row =1;
        while (row<=n){
            int i=1;
            while (i<=space1){
                System.out.print("  ");
                i++;
            }
            int j=star;
            while (j>=1){
                System.out.print(j+" ");
                j--;
            }
            int k=1;
            while (k<=space2){
                System.out.print("  ");
                k++;
            }
            int l=1;
            if (row==1 || row==n){
                l++;
            }
            while (l<=star){
                System.out.print(l+" ");
                l++;
            }
            if(row<=n/2) {
                space1 -= 2;
                space2 += 2;
                star++;
            }
            else{
                space1 += 2;
                space2 -= 2;
                star--;
            }
            row++;
            System.out.println();
        }
    }
}
