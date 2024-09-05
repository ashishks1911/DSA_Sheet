package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class StringsStringCompression {
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
                ans += count>1?""+ch+count:""+ch;
                ch=s.charAt(i);
                count=1;
            }
        }
        ans += count>1?""+ch+count:""+ch;
        System.out.println(ans);
    }
}
