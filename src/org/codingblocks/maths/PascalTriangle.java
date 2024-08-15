package org.codingblocks.maths;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        int row=1;
        int star=1;
        while (row<=n){
            //star
            int i=1;
            while (i<=star){
                System.out.print("* ");
                i++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}
