package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class ReplaceAll0sWith5 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);

    }
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n/10);
        int r = n%10;
        if(r != 0)
            System.out.print(r);
        else
            System.out.print(5);

    }
}
