package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

/**
 * https://hack.codingblocks.com/app/contests/6374
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        // To print all armstrong number from n1 to n2 (inclusive)
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1+","+n2);
        for (int i=n1; i<=n2; i++){
            //check each i for armstrong number
            int nos = count(i);
            int num =i;
            int sum =0;
            while (num!=0){
                int rem = num%10;
                sum += (int) Math.pow(rem,nos);
                num /=10;
            }
            if (sum==i) {
                System.out.println(i);
            }
        }

    }

    public static int count(int n){
        int count=0;
        while (n!=0){
            count++;
            n /=10;
        }
        return count;
    }


}
