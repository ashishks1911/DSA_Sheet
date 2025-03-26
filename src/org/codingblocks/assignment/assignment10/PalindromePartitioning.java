package org.codingblocks.assignment.assignment10;

import java.util.*;

public class PalindromePartitioning {
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        palindromePartition(s, ans, ll);
        return ans;
    }

    public static void palindromePartition(String s, List<List<String>> ans, List<String> ll) {
        if (s.length() == 0) {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String str = s.substring(0, i);
            if (isPalindromic(str)) {
                ll.add(str);
                palindromePartition(s.substring(i), ans, ll);
                ll.remove(ll.size() - 1);
            }
        }
    }

    public static boolean isPalindromic(String s) {
        int i = 0;
        int j = s.length() - 1;
        if (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
