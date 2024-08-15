package org.codingblocks.pattern;

/**
 * Pattern 7 :
 *      *   *   *   *   *
 *      *               *
 *      *               *
 *      *               *
 *      *   *   *   *   *
 *
 */
public class Pattern7 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=5;
        while (row<=n){
            int i=1;
            while (i<=star){
                if (row>1 && i>1 && row<n && i<n)
                    System.out.print("   ");
                else
                    System.out.print("*  ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
