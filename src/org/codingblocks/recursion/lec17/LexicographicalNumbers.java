package org.codingblocks.recursion.lec17;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        int n = 13;
        lexicographicalCounting(n,0);
    }

    public static void lexicographicalCounting(int n, int curr) {
        if (curr>n){
            return;
        }
        System.out.println(curr);
        int i=0;
        if (curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            lexicographicalCounting(n,curr*10 + i);
        }
    }

}
