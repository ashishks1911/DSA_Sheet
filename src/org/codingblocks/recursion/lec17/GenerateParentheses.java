package org.codingblocks.recursion.lec17;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> list = new ArrayList<>();
        generateParentheses(n,0,0,"",list);
        System.out.println(list);
    }
    public static void generateParentheses(int n, int open, int close, String ans, List<String> li){
        if (open==n && close==n){
            System.out.println(ans);
            return;
        }
        if (open>n || close>open){
            return;
        }
        generateParentheses(n,open+1, close, ans+"(",li);
        generateParentheses(n, open, close+1, ans+")",li);
    }
}
