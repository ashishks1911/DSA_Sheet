package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        toInt(n, 0);
    }

    public static void toInt(String s, int ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        int i = ch - '0';
        toInt(s.substring(1), ans * 10 + i);
    }
}
