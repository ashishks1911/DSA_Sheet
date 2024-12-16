package org.codingblocks.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(arr));

    }
    public static List<List<String>> groupAnagrams(String [] arr){
        HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String key = anagramKey(arr[i]);
            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }

        List<List<String>> ans = new ArrayList<>();
        for (String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }

    private static String anagramKey(String s) {
        int []freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i]+" ");
        }
        return sb.toString();
    }


}
