package org.codingblocks.string;

/**
 *
 */
public class CheckPalindromic {
    public static void main(String[] args) {
        String s = "nitin";
    }

    public static boolean isPalindromic(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void allSubstring(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }



}
