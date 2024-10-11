package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class ReplaceHiPart2 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //count no. of times "hi" appears not followed by t
        // remove "hi"s , which is not followed by t
        //replace all "hi" with "bye", not the one which is followed by t
        replaceHi(s, "", "", s.length());

    }

    public static void replaceHi(String s, String ans1, String ans2, int n) {
        if (s.length() == 0 || s.length() == 1) {
            String ans = ans1 + s;
            System.out.println((n - ans.length()) / 2);
            System.out.println(ans);
            System.out.println(ans2 + s);
            return;
        }
        if (s.charAt(0) == 'h' && s.charAt(1) == 'i') {
            if (s.length() > 2 && s.charAt(2) == 't') {
                replaceHi(s.substring(2), ans1 + "hi", ans2 + "hi", n);
            } else {
                replaceHi(s.substring(2), ans1, ans2 + "bye", n);
            }
            return;
        }
        replaceHi(s.substring(1), ans1 + s.charAt(0), ans2 + s.charAt(0), n);
    }

}
