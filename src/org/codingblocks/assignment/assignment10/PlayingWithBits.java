package org.codingblocks.assignment.assignment10;

import java.util.*;

public class PlayingWithBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = 0;
            while (start <= end) {
                int num = start;
                int c = 0;
                while (num != 0) {
                    c++;
                    num &= num - 1;
                }
                sum += c;
                start++;
            }
            System.out.println(sum);
        }

    }

}
