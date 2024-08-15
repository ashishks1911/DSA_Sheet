package org.codingblocks.assignment.assignment1;

import java.util.Scanner;
/**
 * Assignment link : https://hack.codingblocks.com/app/contests/6289
 *
 */

public class PatternRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n-1;
        int star=1;
        int row =1;
        while (row <= 2*n -1){
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int val;
            if(row<=2*n/2){
                val = row;
            }
            else{
                val = 2*n-row;
            }
            while (j<=star){
                System.out.print(val+ " ");
                j++;
                if (j <= star/2 +1){
                    val++;
                }
                else {
                    val--;
                }
            }
            if (row< 2*n/2) {
                space--;
                star += 2;
            }
            else {
                space++;
                star -=2;
            }
            row++;
            System.out.println();
        }
    }
}
