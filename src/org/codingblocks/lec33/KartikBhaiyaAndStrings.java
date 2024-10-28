package org.codingblocks.lec33;

/**
 * https://codeskiller.codingblocks.com/problems/446
 */
public class KartikBhaiyaAndStrings {
    public static void main(String[] args) {
        String str = "aaaabaaabaaabaaaba";
        int k = 2;
        System.out.println(Math.max(maxLength(str,k,'a'),maxLength(str,k,'b')));
    }

    public static int maxLength(String str, int k, char ch) {
        int flip = 0, si = 0, ei = 0, ans = 0;
        while (ei < str.length()) {
            //grow
            if (str.charAt(ei) == ch) {
                flip++;
            }

            //shrink
            while (flip > k && si <= ei) {
                if (str.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }

            //ans update
            ans = Math.max(ans, ei - si + 1);
            ei++;
        }
        return ans;
    }
}
