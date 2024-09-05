package org.codingblocks.assignment.assignment5;

import java.util.Scanner;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

    }

    public static char bruteForce(String s) {
        int max = 0;
        char ans = ' ';
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (count > max) {
                ans = s.charAt(i);
            }
            max = Math.max(max, count);

        }
        return ans;
    }
}
