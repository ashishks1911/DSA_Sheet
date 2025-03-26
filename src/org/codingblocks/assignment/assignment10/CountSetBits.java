package org.codingblocks.assignment.assignment10;

import java.util.*;

public class CountSetBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int num = sc.nextInt();
            int c = 0;
            while (num != 0) {
                c++;
                num &= num - 1;
            }
            System.out.println(c);
        }
    }
    
}
