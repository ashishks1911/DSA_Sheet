package org.codingblocks.recursion;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    boolean flag = search(board, i, j, word, 0);
                    if (flag) {
                        System.out.println(true);
                        return;
                    }
                }
            }
        }

        System.out.println(false);

    }

    public static boolean search(char[][] board, int cr, int cc, String word, int idx) {
        if (cr < 0 || cc < 0 || cr >= board.length || cc >= board[0].length || word.charAt(idx) != board[cr][cc]) {
            return false;
        }
        int r[] = {1, -1, 0, 0};
        int c[] = {0, 0, 1, -1};
        for (int i = 0; i < r.length; i++) {
            boolean ans = search(board, cr + r[i], cc + c[i], word, idx + 1);
            if (ans) {
                return true;
            }
        }
        return false;
    }

}
