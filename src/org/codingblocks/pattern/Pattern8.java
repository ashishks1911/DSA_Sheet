package org.codingblocks.pattern;

/**
 * Pattern 8 :
 *      *           *            *__ __ __ __*      11 15
 *         *     *               ___*__ __*___      22 24
 *            *           =>     ___ __*__ ___      33
 *         *     *               ___*__ __*___      42 44
 *      *           *            *__ __ __ __*      51 55
 */
public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        int row =1;
        while (row<=n){
            int i=1;
            while (i<=n){
                if(i==row || i== (n - row + 1))
                    System.out.print("*");
                System.out.print("   ");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
