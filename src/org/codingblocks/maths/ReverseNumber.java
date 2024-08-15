package org.codingblocks.maths;

/**
 *
 * 1287 =>
 *      7 = 7 = prev
 *      78 = prev *10 +rem;
 *      782
 *      7821
 *
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123456;
        int reverse=0;
        while (n!=0){
            int rem = n % 10;
            reverse = reverse*10 + rem;
            n /=10;
        }
        System.out.println(reverse);
    }
}
