package org.codingblocks.recursion.lec20;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String ques = "nitin";
        List<List<String>> ans = new ArrayList<>();
        List<String> ll = new ArrayList<>();
//        partitioning(ques, "");
        partitioning(ques, ll, ans);

    }

    public static void partitioning(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindromic(s)) {
                partitioning(ques.substring(i), ans + s + "|");
            }
        }
    }

    public static void partitioning2(String ques, List<String> li) {
        if (ques.length() == 0) {
            System.out.println(li);
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindromic(s)) {
                li.add(s);
                partitioning2(ques.substring(i), li);
                li.remove(li.size() - 1);
            }
        }
    }

    public static void partitioning(String ques, List<String> li, List<List<String>> ans) {
        if (ques.length() == 0) {
            System.out.println(li);
            ans.add(new ArrayList<>(li));
            return;
        }
        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindromic(s)) {
                li.add(s);
                partitioning(ques.substring(i), li,ans);
                li.remove(li.size() - 1);
            }
        }
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
}
