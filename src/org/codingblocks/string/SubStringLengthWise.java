package org.codingblocks.string;

public class SubStringLengthWise {
    public static void main(String[] args) {
        String s = "NITIN";
        lengthWiseSubString(s);
    }

    public static void lengthWiseSubString(String s) {
        for (int len = 1; len < s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {
                int i = j - len;
                System.out.println(s.substring(i,j));
            }
        }
    }

}
