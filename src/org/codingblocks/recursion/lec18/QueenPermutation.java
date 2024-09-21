package org.codingblocks.recursion.lec18;

public class QueenPermutation {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;     //total queen
        permutation(board, tq, 0, "");

    }

    public static void permutation(boolean[] board, int tq, int qpsf, String ans) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (!board[i]) {
                board[i] = true;
                permutation(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
                board[i]=false;
            }
        }
    }
}
