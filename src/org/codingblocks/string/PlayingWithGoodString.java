package org.codingblocks.string;

import java.util.Scanner;

/**
 * Codingblocks Codeskiller Question
 */
public class PlayingWithGoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
    }
    public static int goodString(String s){
        int ans =0;
        int count=0;
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (isVowel(ch)){
                count++;
            }
            else {
                ans = Math.max(ans,count);
                count=0;
            }
        }
        ans = Math.max(ans,count);
        return ans;
    }
    public static boolean isVowel(char ch){
        if (ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        return false;
    }
}
