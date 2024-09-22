package org.codingblocks.assignment.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.
 * https://hack.codingblocks.com/app/contests/6537
 * Assignment on String
 *
 */
public class canYouReadThis {
    private static int anInt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 65 && ch <= 90) {
                if (idx!=-1) {
                    System.out.println(s.substring(idx, i));
                }
            }
        }
        System.out.println(s.substring(idx));
    }
}
