package org.ashish.interview.hashing.seta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/find-common-characters/description/
 */
public class P8_FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(findCommonCharacters(words));
        System.out.println(betterSolution(words));
    }

    public static List<String> findCommonCharacters(String[] words) {
        String word = words[0];
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            String str = words[i];
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                temp.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            for (Character key : freq.keySet()) {
                if (temp.containsKey(key)) {
                    freq.put(key, Math.min(freq.get(key), temp.get(key)));
                } else {
                    freq.put(key, 0);       // freq.remove(key); ConcurrentModificationException
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (Character ch : freq.keySet()) {
            int i = freq.get(ch);
            while (i != 0) {
                ans.add(ch + "");
                i--;
            }
        }
        return ans;
    }

    public static List<String> betterSolution(String[] words) {
        List<String> ans = new ArrayList<>();

        char[] hash = new char[26];
        for (char ch : words[0].toCharArray()) {
            hash[ch - 'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            char[] temp = new char[26];
            for (char ch : words[i].toCharArray()) {
                temp[ch - 'a']++;
            }
            for (int j=0; j<26; j++){
                hash[j] = (char) Math.min(temp[j],hash[j]);
                temp[j] = 0;
            }
        }
        for (int i=0; i<26; i++){
            int j = hash[i];
            while (j!=0) {
                char ch = (char) (i + 'a');
                ans.add(ch + "");
                j--;
            }
        }
        return ans;
    }
}
