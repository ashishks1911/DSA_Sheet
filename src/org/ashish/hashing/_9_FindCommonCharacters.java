package org.ashish.hashing;

import java.util.ArrayList;
import java.util.List;

public class _9_FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella", "label","roller"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        char[] hash = new char[26];
        for (char c : words[0].toCharArray()) {
            hash[c - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            String str = words[i];
            char temp[] = new char[26];
            for (char c : str.toCharArray()) {
                temp[c - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                hash[j] = (char) Math.min(hash[j], temp[j]);
                temp[j] = 0;
            }
        }

        for (int i = 0; i < 26; i++) {
            int j = hash[i];
            while (j != 0) {
                char c = (char) (i + 'a');
                list.add(c + "");
                j--;
            }
        }
        return list;
    }
}
