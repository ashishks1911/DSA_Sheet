package org.codingblocks.recursion;

public class CharSearch {
    public static void main(String[] args) {

    }
    public static boolean isPresent(String s, char ch, int i){
        while (i<s.length()){
            if (s.charAt(i)==ch){
                return true;
            }
            i++;
        }
        return false;
    }
}
