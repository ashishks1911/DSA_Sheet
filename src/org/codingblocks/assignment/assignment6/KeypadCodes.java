package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class KeypadCodes {
    public static void main(String args[]) {
        String[] map = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ans = possibleWords(map, str, "");
        System.out.println("\n" + ans);

    }

    public static int possibleWords(String[] map, String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return 1;
        }
        char ch = str.charAt(0);
        String s = map[ch - '0'];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += possibleWords(map, str.substring(1), ans + s.charAt(i));
        }
        return sum;
    }

}
