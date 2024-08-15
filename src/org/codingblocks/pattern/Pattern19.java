package org.codingblocks.pattern;

import java.util.Scanner;

/**
 * Works only for odd number input
 * Pattern 19 :
 *          * * * * *
 *          * *   * *
 *          *       *
 *          * *   * *
 *          * * * * *
 *
 */
public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n/2+1;
        int space = -1;
        int row =1;
        while (row<=n){
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while (j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if (row==1 || row==n){
                k++;
            }
            while (k<=star){
                System.out.print("* ");
                k++;
            }
            if (row<=n/2){
                space+=2;
                star--;
            }
            else {
                space-=2;
                star++;
            }
            row++;
            System.out.println();
        }
    }
}
