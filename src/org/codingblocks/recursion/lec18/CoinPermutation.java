package org.codingblocks.recursion.lec18;

public class CoinPermutation {
    public static void main(String[] args) {
        int coin[] = {1, 2, 3};
        int amount = 4;
        permutation(coin, amount, "");

    }

    public static void permutation(int[] coin, int amount, String ans) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
                permutation(coin, amount - coin[i], ans + coin[i]);
            }
        }
    }

}
