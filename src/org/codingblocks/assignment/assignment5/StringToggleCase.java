package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch>='a')
                ans.append((char) (ch - 32));
            else
                ans.append((char) (ch + 32));
        }
        System.out.println(ans);
    }
}
