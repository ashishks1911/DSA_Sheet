package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        char ch = s.charAt(0);
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(ch==s.charAt(i)){
                count++;
            }else{
                ans += ""+ch+count;
                ch=s.charAt(i);
                count=1;
            }
        }
        ans += ""+ch+count;
        System.out.println(ans);
    }
}
