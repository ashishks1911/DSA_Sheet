package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

/***
 *
 * https://hack.codingblocks.com/app/contests/6374
 *
 * Binary to Decimal
 * Logic :
 *      101010
 *      0 (2^0) => 1*0 => 0
 *      1 (2^1) => 2*1 => 2
 *      0 (2^2) => 0
 *      1 (2^3) => 8*1 + 2(prev sum) => 10
 *      0 (2^4) => 0
 *      1 (2^5) => 32*1 + 10(prev sum) => 42
 *
 *      sum = 2^rem +sum;
 */
public class BinaryToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int mul=1;
        while (n>0){
            int rem = n%10;
            sum += rem*mul;
            mul *=2;
            n /=10;
        }
        System.out.println(sum);
    }
}
