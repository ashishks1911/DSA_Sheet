package org.codingblocks.assignment.assignment7;

import java.util.Scanner;
import java.util.Stack;

public class FormMinimumNumberFromGivenSequence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String s = sc.next();
            System.out.println(miniNumber(s));
        }
    }

    public static String miniNumber(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == 'I') {
                sb.append(count);
                count++;
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
            } else {
                st.push(count);
                count++;
            }
        }
        return sb.toString();
    }
}
