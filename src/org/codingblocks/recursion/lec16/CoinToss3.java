package org.codingblocks.recursion.lec16;

//Remove the possibility of 3 consecutive "H"
public class CoinToss3 {
    public static void main(String[] args) {
        int n = 4;
        coinToss(n, "");
    }

    public static void coinToss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if (ans.length() <2 || !ans.substring(ans.length() - 2).equals("HH")) {
            coinToss(n - 1, ans + "H");
        }
        coinToss(n - 1, ans + "T");
    }
}
