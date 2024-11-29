package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

// Implementation of Push down automata
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOH(n, "A", "C", "B");
    }
    public static void TOH(int n, String src, String hlp, String des){
        if (n==0)
            return;
        TOH(n-1, src, des, hlp);
        System.out.println("Move " + n + "th disk from "+ src +" to "+ des);
        TOH(n-1, hlp, src, des);
    }
}
