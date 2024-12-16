package org.codingblocks.bitmanupulation;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthNumber(n));
    }

    public static int nthNumber(int n) {
        int mul = 5;
        int sum = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                sum += mul;
            }
            n >>= 1;
            mul = mul * 5;      // for power of 5
        }
        return sum;
    }
}
