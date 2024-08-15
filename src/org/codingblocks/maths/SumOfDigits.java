package org.codingblocks.maths;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1287;
        int sum=0;
        while (num!=0){
            int rem = num % 10;
            num /=10;
            sum +=rem;
        }
        System.out.println(sum);
    }
}
