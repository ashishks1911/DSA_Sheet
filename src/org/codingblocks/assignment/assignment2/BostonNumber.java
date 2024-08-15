package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

/***
 *  Composite Number is also known as Boston Number.
 *
 */
public class BostonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isComposite(num));

    }

    public static int isComposite(int num){
        if (num<=3){
            return 0;
        }
        int temp=num;
        int i=2;
        int sum = 0;
        while(i<=num){
            while (num%i==0){
                System.out.println(i);
                sum += sumOfDigit(i);
                num /= i;
            }
            i++;
        }

        if(sumOfDigit(temp)==sum){
            return 1;
        }
        return 0;
    }

    public static int sumOfDigit(int n){
        int digitSum = 0;
        while(n!=0){
            digitSum += n%10;
            n /=10;
        }
        return digitSum;
    }
}
