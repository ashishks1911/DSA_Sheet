package org.codingblocks.pattern;

/**
 * Pattern 5 :
 *      * * * * *
 *        * * * *
 *          * * *
 *            * *
 *              *
 *
 */
public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int star = 5;
        int rows =0;
        while (rows<=n){
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            rows++;
            space++;
            star--;
            System.out.println();
        }
    }
}
