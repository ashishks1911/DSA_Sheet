package org.codingblocks.maths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        if (prime2(n))
            System.out.println("Not Prime");
        else
            System.out.println("Prime");

    }

    public static boolean prime(int n){
        int count=0;
        for (int i=2; i<n; i++){
            if (n % i == 0)
                count++;
        }
        if (count>=1)
            return true;
        return false;
    }
    public static boolean prime2(int n){
    boolean check=false;
        for(int i=2; i<Math.sqrt(n); i++) {
            if (n % i == 0) {
                check = true;
                break;
            }
        }
        return check;
    }
}

