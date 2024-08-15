package org.codingblocks.pattern;

import java.util.Scanner;

/**
 * Pattern 3 : n = 5
 *          * * * * *
 *          * * * *
 *          * * *
 *          * *
 *          *
 *
 */
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int row = 1;
        int star = n;
        while (row<=n){
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            star--;
            row++;
            System.out.println();
        }
    }
}
