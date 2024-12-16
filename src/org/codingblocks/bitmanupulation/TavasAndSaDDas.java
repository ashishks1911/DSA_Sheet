package org.codingblocks.bitmanupulation;

import java.util.Scanner;

public class TavasAndSaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(index(str));
    }

    public static int index(String str) {
        int n = str.length();
        int count = (1 << n) - 2;       // count of n-1 digits
        int pos = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '7') {
                count = count + (1 << pos);
            }
            pos++;
        }
        return count + 1;
    }

}
