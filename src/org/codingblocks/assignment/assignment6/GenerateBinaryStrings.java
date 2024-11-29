package org.codingblocks.assignment.assignment6;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        String s = "1??0?101";
        replaceWildcard(s,"");

    }
    public static void replaceWildcard(String s, String ans){
        if (s.length()==0){
            System.out.println(ans);
            return;
        }
        if (s.charAt(0)=='?'){
            replaceWildcard(s.substring(1), ans +"0");
            replaceWildcard(s.substring(1), ans +"1");
        }
        else
            replaceWildcard(s.substring(1), ans+s.charAt(0));
    }
}
