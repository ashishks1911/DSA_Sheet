package org.codingblocks.pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n/2;
        int space = 1;
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
