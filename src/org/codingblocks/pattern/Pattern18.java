package org.codingblocks.pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n/2+1;
        int row = 1;
        while(row<=n){
            int i=1;
            while (i<space){
                System.out.print("\t");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("*\t");
                j++;
            }

            if(row<=n/2) {
                star += 2;
                space--;
            }else {
                star -= 2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
