package org.codingblocks.recursion;

public class CoinPermutation {
    public static void main(String[] args) {
        int coin[] = {1, 2, 3};
        int amount = 4;
        permutation(coin, amount, "");
        System.out.println("-------------------------");
        combination(coin, amount, "", 0);

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

    public static void combination(int[] coin, int amount, String ans, int idx) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if (amount >= coin[i]) {
                combination(coin, amount - coin[i], ans + coin[i], i);
            }
        }
    }
}
