package org.codingblocks.assignment.assignment10;

import java.util.*;

public class CountingBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            int c = 0;
            int val = i;
            while (val != 0) {
                c++;
                val &= val - 1;
            }
            System.out.print(c + " ");
        }
    }
}
