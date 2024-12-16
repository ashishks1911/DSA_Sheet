package org.codingblocks.assignment.assignment7;
import java.util.Scanner;
public class TheQueueGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(isValid(arr));
        }
    }

    public static String isValid(int[] arr) {
        int push = 0, pop = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                push++;
            } else {
                pop++;
            }
            if (pop > push) {
                return "Invalid";
            }
        }
        return "Valid";
    }
}
