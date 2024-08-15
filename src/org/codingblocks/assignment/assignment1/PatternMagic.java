package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

public class PatternMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space=-1;
        int row =1;
        int star=n;
        while (row <= 2*n-1){
            int i=1;
            while (i<=star){
                System.out.print("*");
                i++;
            }
            int j=1;
            while (j<=space){
                System.out.print(" ");
                j++;
            }
            int k=1;
            if (row==1 || row==2*n-1){
                k++;
            }
            while (k<=star){
                System.out.print("*");
                k++;
            }
            if(row < 2*n/2) {
                star--;
                space += 2;
            }else {
                star++;
                space -= 2;
            }
            row++;
            System.out.println();
        }
    }
}
