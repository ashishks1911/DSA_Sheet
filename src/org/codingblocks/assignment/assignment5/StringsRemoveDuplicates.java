package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class StringsRemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = s.charAt(0);
        String ans =""+ch;
        for (int i=1; i<s.length(); i++){
            if (ch != s.charAt(i)){
                ans += ""+s.charAt(i);
                ch = s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}
