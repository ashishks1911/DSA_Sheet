package org.codingblocks.bitmanupulation;

public class CountSetBit {
    public static void main(String[] args) {
        int n = 84;
        System.out.println(countSetBit(n));
        System.out.println(fastCountSetBit(n));
    }

    public static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static int fastCountSetBit(int n){
        int count = 0;
        while (n>0){
            n = (n & (n-1));
            count++;
        }
        return count;
    }
}
