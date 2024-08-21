package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 * https://hack.codingblocks.com/app/contests/6435
 */
public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int []price = new int[items];
        for (int i=0; i<items; i++){
            price[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i=1; i<=q; i++){
            int A = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(checkShopkeeper(price,A,k));
        }
    }

    public static String checkShopkeeper(int[] price, int A, int k){
        int count =0;
        for (int i=0; i<price.length; i++){
            if (A%price[i]==0)
                count++;
        }
        return count>=k?"Yes":"No";
    }
}
