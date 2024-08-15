package org.codingblocks.pattern;

/**
 *
 * Pattern 2 : n = 5
 *          *
 *          * *
 *          * * *
 *          * * * *
 *          * * * * *
 *
 */

public class Pattern2 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        while (row<=n){
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            star++;
            System.out.println();
            row++;
        }
    }
}
