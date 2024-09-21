package org.codingblocks.recursion.lec20;

/**
 * https://leetcode.com/problems/count-primes/description/
 */
public class CountPrimes {
    public static void main(String[] args) {

    }

    public static boolean isPrime(int n){
        int div = 2;
        while (div*div <=n){
            if (n%div==0){
                return false;
            }
            div++;
        }
        return true;
    }
}
