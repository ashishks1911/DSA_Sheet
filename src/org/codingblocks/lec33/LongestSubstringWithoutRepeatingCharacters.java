package org.codingblocks.lec33;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int si=0, ei=0, len=0;
        Set<Character> set = new HashSet<>();
        while(ei<s.length()){

            //shrink
            if(set.contains(s.charAt(ei))){
                while(si<=ei && set.contains(s.charAt(ei))){
                    set.remove(s.charAt(si));
                    si++;
                }
            }
            //ans update
            set.add(s.charAt(ei));
            len = Math.max(len, ei - si + 1);
            ei++;
        }
        return len;
    }
}
