package org.codingblocks.assignment.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MappedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        print(str, "", new ArrayList<>(), str);
    }

    public static void print(String s, String ans, List<String> li, String org) {
        if (s.length() == 0) {
            for (String str : li) {
                int num = Integer.parseInt(str);
                System.out.print((char) (num - 1 + 'A'));
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String st = s.substring(0, i);
            if (!st.equals(org)) {
                li.add(st);
                print(s.substring(i), ans + st, li, org);
                li.remove(li.size() - 1);
            }
        }
    }
}
