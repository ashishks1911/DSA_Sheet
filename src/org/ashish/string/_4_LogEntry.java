package org.ashish.string;

import java.util.HashMap;

/**
 * https://www.desiqna.in/11383/amazon-sde-internship-coding-questions-and-solutions-2023
 *
 * Given a log entry s and a target word t, the target word t aan be obtained by selecting some subset
 * of characters from s that can be rearranged to form String t and removing them from s. Determine
 * the maximum number of times the target word can be removed from given log entry.
 */
public class _4_LogEntry {
    public static void main(String[] args) {
        String s = "mononom";
        String t = "mon";
        System.out.println(solution(s,t));
    }

    public static int solution(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (Character ch : map2.keySet()){
            if (!map1.containsKey(ch)){
                return 0;
            }else {
                ans = Math.min(ans,map1.get(ch)/map2.get(ch));
            }
        }
        return ans;
    }
}
