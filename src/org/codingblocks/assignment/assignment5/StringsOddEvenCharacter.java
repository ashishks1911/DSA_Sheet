package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class StringsOddEvenCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i % 2 == 0)
                ans += ""+(char) (ch + 1);
            else
                ans += ""+(char) (ch - 1);
        }
        System.out.println(ans);
    }
}
