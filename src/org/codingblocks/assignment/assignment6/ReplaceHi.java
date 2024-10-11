package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class ReplaceHi {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        replaceHi(str, "", "", str.length());

    }

    public static void replaceHi(String str, String ans1, String ans2, int n) {
        if (str.length() == 0 || str.length() == 1) {
            String ans = ans1 + str;
            System.out.println((n - ans.length()) / 2);
            System.out.println(ans);
            System.out.println(ans2 + str);
            return;
        }
        if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            replaceHi(str.substring(2), ans1, ans2 + "bye", n);
            return;
        }
        replaceHi(str.substring(1), ans1 + str.charAt(0), ans2 + str.charAt(0), n);
    }


}
