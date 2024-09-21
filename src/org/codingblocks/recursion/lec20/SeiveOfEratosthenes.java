package org.codingblocks.recursion.lec20;

/*
    count prime number algo
 */
public class SeiveOfEratosthenes {
    public static void main(String[] args) {

    }

    public static int primeSieve(int n) {
        int[] prime = new int[n + 1];
        prime[0] = 1;
        prime[1] = 1;
        for (int i = 2; i * i <= prime.length; i++) {
            if (prime[i] == 0) {
                for (int j = 2; i * j < prime.length; j++) {
                    prime[i * j] = 1;
                }
            }
        }
        int c = 0;
        for (int i = 2; i < prime.length; i++) {
            if (prime[i] == 0) {
                c++;
            }
        }
        return c;
    }

}
