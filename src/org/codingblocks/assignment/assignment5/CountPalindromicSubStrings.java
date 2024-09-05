package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class CountPalindromicSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for (int i=0; i<s.length(); i++){
            for (int j=i+1; j<=s.length(); j++){
                String str = s.substring(i,j);
                System.out.println(str);
                if (isPalindrome(str))
                    count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
