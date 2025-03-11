package org.codingblocks.assignment.assignment9;

import java.util.*;

public class ExistOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            int arr[] = new int[l];
            for (int i = 0; i < l; i++) {
                arr[i] = sc.nextInt();
            }
            int q = sc.nextInt();
            while (q-- > 0) {
                int val = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < l; i++) {
                    if (arr[i] == val) {
                        found = true;
                        break;
                    }
                }
                if (found)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }

}
