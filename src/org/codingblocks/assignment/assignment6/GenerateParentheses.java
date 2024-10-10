package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class GenerateParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generateParentheses(n, 0, 0, "");
    }

    public static void generateParentheses(int n, int open, int close, String ans) {
        if (open == n && close == n) {
            System.out.println(ans);
            return;
        }
        if (open > n || close > open) {
            return;
        }
        generateParentheses(n, open, close + 1, ans + ")");
        generateParentheses(n, open + 1, close, ans + "(");
    }
}
