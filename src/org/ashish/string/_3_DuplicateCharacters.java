package org.ashish.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.
 */
public class _3_DuplicateCharacters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        bruteForce(s);
        System.out.println("-----------------");
        hashingSolution(s);
    }

    public static void bruteForce(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        int p1 = 0;
        int p2 = 0;
        while (p2 < charArr.length) {
            while (p2 < charArr.length && charArr[p1] == charArr[p2]) {
                p2++;
            }
            if (p2 - p1 > 1) {
                System.out.println(charArr[p1] + ",count " + (p2 - p1));
            }
            p1 = p2;
        }
    }

    public static void hashingSolution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ", count " + entry.getValue());
            }
        }
    }
}
