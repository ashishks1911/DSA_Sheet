package org.codingblocks.recursion.lec19;

/**
 * https://leetcode.com/problems/unique-paths/description/
 */
public class MazePath {
    public static void main(String[] args) {
        // TODO with 2D Arraylist
        int m = 3;
        int n = 3;
        printPath(0, 0, m-1,n-1,"");

    }

    /**
     *
     * @param cr current row
     * @param cc current col
     * @param er end row
     * @param ec end col
     * @param ans
     */
    public static void printPath(int cr, int cc, int er, int ec, String ans){
        if (cc==ec && cr==er){
            System.out.println(ans);
            return;
        }
        if (cr>er || cc>ec){
            return;
        }
        printPath(cr, cc+1, er,ec,ans+"H");
        printPath(cr+1, cc, er,ec,ans+"V");
    }
}
