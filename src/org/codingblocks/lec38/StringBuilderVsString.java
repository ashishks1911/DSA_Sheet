package org.codingblocks.lec38;

public class StringBuilderVsString {
    public static void main(String[] args) {
        stringPow();
        stringBuilderPow();
    }

    public static void stringPow() {
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s = s + i;
        }
    }

    public static void stringBuilderPow() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
    }
}
