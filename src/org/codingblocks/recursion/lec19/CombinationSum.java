package org.codingblocks.recursion.lec19;

public class CombinationSum {
    public static void main(String[] args) {
        int coin[] = {1,2,3};
        int amount =4;
//        ArrayList list = new ArrayList();
//        combination(coin,amount, list);
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
