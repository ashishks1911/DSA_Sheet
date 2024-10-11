package org.codingblocks.recursion.lec19;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
 */
public class KeyPad {
    public static void main(String[] args) {
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String digits = "23";
        List<String> list = new ArrayList<>();
        if (digits.length() != 0)
            letterCombination(digits, keypad, "", list);
        System.out.println(list);
    }

    public static void letterCombination(String digits, String[] keypad, String ans, List<String> li) {
        if (digits.length() == 0) {
            li.add(ans);
            return;
        }
        char ch = digits.charAt(0);
        String str = keypad[ch - '0'];
        for (int i = 0; i < str.length(); i++) {
            letterCombination(digits.substring(1), keypad, ans + str.charAt(i), li);
        }
    }
}
