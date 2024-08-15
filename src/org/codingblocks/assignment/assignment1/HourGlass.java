package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star =n;
        int row =1;
        int space=0;
        while (row<=2*n+1){
            int i=0;
            while (i<space) {
                System.out.print("  ");
                i++;
            }
            int j=star;
            while (0<=j) {
                System.out.print(j+" ");
                j--;
            }
            int k=1;
            while (k<=star){
                System.out.print(k+" ");
                k++;
            }
            if(row<=2*n/2) {
                star--;
                space++;
            }
            else {
                star++;
                space--;
            }
            row++;
            System.out.println();
        }
    }
}
