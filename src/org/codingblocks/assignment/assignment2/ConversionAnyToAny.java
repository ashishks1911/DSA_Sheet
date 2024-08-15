package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

public class ConversionAnyToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int n = sc.nextInt();
        int num1 = n;

        // source to decimal
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
