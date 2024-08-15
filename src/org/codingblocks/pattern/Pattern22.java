package org.codingblocks.pattern;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star=n;
        int space = -1;
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
            if (row==1){
                k++;
            }
            while (k<=star){
                System.out.print("* ");
                k++;
            }

//            System.out.print("space :"+space+", star : "+star+", row:"+row);
            star--;
            row++;
            space += 2;
            System.out.println();
        }
    }

    /**
     * Q3,Q5,Q7,Q10,11,
     * Try : 13,14,15,16
     * 17,18,19,20
     * 23,24
     */
}
