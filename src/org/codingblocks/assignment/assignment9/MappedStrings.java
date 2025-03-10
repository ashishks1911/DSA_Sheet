package org.codingblocks.assignment.assignment9;

import java.util.HashMap;
import java.util.Scanner;

public class MappedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Character> map = new HashMap<>();
        for (int i = 1, ch = 'A'; i <= 26; i++, ch++) {
            map.put(i, (char) ch);
        }
        print(String.valueOf(n), "", map);

    }

    public static void print(String s, String ans, HashMap<Integer, Character> map) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        print(s.substring(1), ans + map.get(Integer.parseInt(s.charAt(0) + "")), map);
        if (s.length() >= 2) {
            String ch = s.substring(0, 2);
            if (Integer.parseInt(ch) <= 26) {
                print(s.substring(2), ans + map.get(Integer.parseInt(ch)), map);
            }
        }

    }
}
