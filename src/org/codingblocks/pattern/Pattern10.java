package org.codingblocks.pattern;

/**
 *
 * Pattern 10 :  n = 5
 *          * * * * * * * * *
 *            * * * * * * *
 *              * * * * *
 *                * * *
 *                  *
 *
 */
public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        int star=2*n - 1;
        int rows =1 ;
        while (rows<=n){
            int i=1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            space++;
            star-=2;
            rows++;
            System.out.println();
        }
    }
}
