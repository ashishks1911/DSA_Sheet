package org.codingblocks.assignment.assignment2;

/***
 *
 * Ex : 1234
 * Logic :
 *      4 = rem
 *      43 = prev * 10 + rem
 *      432 = prev* 10 + rem
 *      4321 = prev*10 + rem
 *
 */
public class ReverseNumber {
    public static void main(String[] args) {
        int n =123456789;
        int reverse = 0;
        while(n!=0){
            int rem = n%10;
            reverse = reverse*10 +rem;
            n /=10;
        }
        System.out.println(reverse);
    }


}

