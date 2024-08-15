package org.codingblocks.pattern;

/**
 * Pattern 6 :
 *     *  *  *  *  *
 *           *  *  *  *
 *                 *  *  *
 *                       *  *
 *                            *
 */
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int row =1;
        int space=0;
        int star=n;
        while (row<=n){
            int i=0;
            while (i<=space){
                System.out.print("   ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            space = space + 2;
            star--;
            row++;

        }
    }
}
