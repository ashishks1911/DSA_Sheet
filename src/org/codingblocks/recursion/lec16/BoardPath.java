package org.codingblocks.recursion.lec16;

public class BoardPath {
    public static void main(String[] args) {
        int diceFace = 3;
        int n =4 ;  //steps to take
        printPath(n,0,diceFace,"");
    }

    /**
     *
     * @param n total steps to take
     * @param curr total steps taken
     * @param diceFace total dice face available
     * @param ans
     */
    public static void printPath(int n, int curr,int diceFace,String ans){
        if (n==curr){
            System.out.println(ans);
            return;
        }
        if (curr>n){
            return;
        }
        for (int dice=1; dice<=diceFace; dice++){
            printPath(n, curr+dice, diceFace, ans+dice);
        }
    }

    public static int countPath(int n, int curr,int diceFace,String ans){
        if (n==curr){
            System.out.println(ans);
            return 1;
        }
        if (curr>n){
            return 0;
        }
        int x =0;
        for (int dice=1; dice<=diceFace; dice++){
            x += countPath(n, curr+dice, diceFace, ans+dice);
        }
        return x;
    }
}
