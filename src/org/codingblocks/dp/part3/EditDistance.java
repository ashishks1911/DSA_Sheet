package org.codingblocks.dp.part3;

/**
 * https://www.spoj.com/problems/EDIST/
 */
public class EditDistance {
    public static void main(String[] args) {
        String s1 = "FOOD";
        String s2 = "MONEY";


    }

    public static int minimumOps(String s1, String s2, int i, int j) {
        if (i == s1.length()) {
            return s2.length() - j;
        }
        if (j == s2.length()) {
            return s1.length() - i;
        }
        int ans = 0;
        if (s1.charAt(i) == s2.charAt(j)) {
            ans = minimumOps(s1, s2, i + 1, j + 1);
        } else {
            int D = minimumOps(s1, s2, i + 1, j);
            int I = minimumOps(s1, s2, i, j + 1);
            int R = minimumOps(s1, s2, i + 1, j + 1);
            ans = 1 + Math.min(I, Math.min(D, R));
        }
        return ans;
    }
}
