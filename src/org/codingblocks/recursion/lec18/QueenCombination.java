package org.codingblocks.recursion.lec18;

public class QueenCombination {
    public static void main(String[] args) {
        int n = 4;
        boolean[] board = new boolean[n];
        int tq = 2;     //total queen
        combination(board, tq, 0, "",0);

    }

    public static void combination(boolean[] board, int tq, int qpsf, String ans, int idx) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        //no need of board , we can remove it also
        for (int i = idx; i < board.length; i++) {
            if (!board[i]) {
                board[i] = true;
                combination(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf, i + 1);
                board[i] = false;
            }
        }
    }
}
