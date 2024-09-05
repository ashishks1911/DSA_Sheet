package org.codingblocks.assignment.assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class CBNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "81615";
        System.out.println(countCBNumbers(s));
    }

    public static int countCBNumbers(String s) {
        boolean[] visited = new boolean[s.length()];
        int count = 0;
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                String str = s.substring(i, j);
                if (isCBNumber(Long.parseLong(str)) && isValid(visited, i, j - 1)) {
                    System.out.println(str + ", " + i + " : " + j);
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                    System.out.println(Arrays.toString(visited));
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isValid(boolean[] visited, int i, int j) {
        for (int k = i; k < j; k++) {
            if (visited[k])
                return false;
        }
        return true;
    }

    private static boolean isCBNumber(long num) {
        if (num == 0 || num == 1)
            return false;
        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int a : arr) {
            if (num == a)
                return true;
        }
        for (int a : arr) {
            if (num % a == 0)
                return false;
        }
        return true;
    }
}
