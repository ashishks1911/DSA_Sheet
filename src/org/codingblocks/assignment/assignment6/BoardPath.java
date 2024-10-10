package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class BoardPath {
    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //size of board
        int m = sc.nextInt();       //faces of dice
        int ans = printPath(n, m, 0, "");
        System.out.println("\n" + ans);
    }

    public static int printPath(int n, int m, int currSum, String ans) {
        if (currSum == n) {
            System.out.print(ans + " ");
            return 1;
        }
        if (currSum > n) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += printPath(n, m, currSum + i, ans + i);
        }
        return sum;
    }
}
