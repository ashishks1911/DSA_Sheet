package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class MazePathD {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();  //no. of rows
        int N2 = sc.nextInt();  //no. of columns
        int ans = path(0, 0, N2 - 1, N1 - 1, "");
        System.out.println("\n" + ans);

    }

    public static int path(int cr, int cc, int er, int ec, String ans) {
        if (cc == ec && cr == er) {
            System.out.print(ans + " ");
            return 1;
        }

        if (cc > ec || cr > er) {
            return 0;
        }

        int t1 = path(cr, cc + 1, er, ec, ans + "V");
        int t2 = path(cr + 1, cc, er, ec, ans + "H");
        int t3 = path(cr + 1, cc + 1, er, ec, ans + "D");
        return t1 + t2 + t3;
    }
}
