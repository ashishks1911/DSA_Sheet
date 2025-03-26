package org.codingblocks.assignment.assignment10;

import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String str = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            boolean found = false;
            int j = 0;
            while (j < str.length()) {
                if (map.get(str.charAt(j)) == 1) {
                    found = true;
                    break;
                }
                j++;
            }
            if (found) {
                System.out.println(str.charAt(j));
            } else {
                System.out.println("-1");
            }
        }
    }

}
