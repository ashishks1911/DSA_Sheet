package org.codingblocks.pattern;

/**
 * Mirror image concept Q13, Q14, Q17, Q18
 *
 */
public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int row=1;
        int star=1;
        while (row <= 2*n -1){
            int i=1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            //Mirror
            if (row<n)
                star++;
            else
                star--;
            System.out.println();
            row++;
        }
    }
}