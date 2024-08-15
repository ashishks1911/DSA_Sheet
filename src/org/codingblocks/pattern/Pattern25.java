package org.codingblocks.pattern;

public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int row =1;
        int space=n-1;
        int star=1;
        int val=1;
        while (row<=n){
            int i=1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print(val+"\t");
                val++;
                j++;
            }
            System.out.println();
            space--;
            star +=2;
            row++;

        }
    }
}
