package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class PlayingWithGoodString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(bruteForce(s));
        System.out.println(solution(s));
    }
    public static int bruteForce(String s){
        int ans=0;
        for (int i=0; i<s.length(); i++){
            for (int j=i; j<s.length(); j++){
                String str = s.substring(i,j);
                int count=0;
                for (int k=0; k<str.length(); k++){
                    if (!isVowel(str.charAt(k)))
                        break;
                    count++;
                }
                ans = Math.max(count,ans);
            }
        }
        return ans;
    }
    public static int solution(String s){
        int ans = 0;
        for (int i=0,j=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (isVowel(ch)){
                j=i;
                while (j<s.length() && isVowel(s.charAt(j))){
                    j++;
                }
            }
            ans = Math.max(ans,j-i);
        }
        return ans;
    }
    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
}
