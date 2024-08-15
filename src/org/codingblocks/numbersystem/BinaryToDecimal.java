package org.codingblocks.numbersystem;

import java.util.Scanner;

/**
 *     5 in binary = 101
 *     5 in byte data type = 0000 0101
 *
 *                256 128 64 32 16 8 4 2 1
 *      _ _ _ _ _ _ _ _  +ve numbers range in 8 bits = 0 to 255
 *      _ _ _ _ _ _ _ _  -ve and +ve number range in 8 bits = -128 to +127
 *      +ve = 0 _ _ _ _ _ _ _
 *      -ve = 1 _ _ _ _ _ _ _
 *      range as per sign bit [-127, +127] = 255  but 8 bits can hold 256 values so it become invalid
 *      hence , sign bit approach become wrong
 *
 *      +ve = 0 0 0 0 0 0 0 0  => negative zero
 *      -ve = 1 0 0 0 0 0 0 0  => positive zero
 *
 *      Complement of a binary number is 1's complement
 *
 *      1's complement => also become invalid
 *      Adding 1 in 1's complement is 2's complement
 *
 *      Ex :  101101100
 *      1's complement  =>  010010011
 *
 *      2's complement is only for negative number
 *      1 0 0 0 0 0 0 0
 *      1's complement => 0 1 1 1 1 1 1 1
 *      2's complement => 1 0 0 0 0 0 0 0 => -128
 *      Range of binary number is [-128, 127] => -2^7 to 2^7-1
 *
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int n = sc.nextInt();
        int num1 = n;
        if(sb!=10){
            num1 = conversion(n,sb, 10);
        }

        //decimal to destination
        int num2 = conversion(num1,10,db);
        System.out.println(num2);
    }

    public static int conversion(int num, int base, int des){
        int temp = num;
        int sum = 0;
        int mul=1;
        while(temp!=0){
            int rem = temp%des;
            sum = sum + rem*mul;
            mul *=base;
            temp /=des;
        }
        return sum;
    }
}
