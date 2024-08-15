package org.codingblocks.assignment.assignment2;

/***
 * LCM : Least Common Multiple
 * Example : Calculate Lcm of 4 and 6
 *
 * Logic :
 * Multiple of 4 : 4    8       12      16      20       24     28       32
 * Multiple of 6 :      6       12              18       24       36
 *
 * Common :                 12(least)   24
 * Answer : 12
 *
 * GCD : Greatest Common Divisor
 * Largest number which divides both n1 and n2
 *
 * LCM and GCD Relation :
 *      LCM(a,b) = a*b / GCD(a,b)
 *
 */
public class LcmGcd {
    public static void main(String[] args) {
        int ans = gcdRecursion(20,15);
        System.out.println(ans);

    }

    public static int lcm(int n1, int n2){
        return 0;
    }

    public static int gcd(int n1, int n2){
        int gcd =1;
        for (int i=1; i<=Math.min(n1,n2); i++){
            if (n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static int gcdBetter(int n1, int n2){
        int gcd =1;
        for (int i=Math.min(n1,n2); i>0; i--){
            if (n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    /***
     * Euclidean Algorithm
     * GCD of two numbers remains the same even if the smaller number is subtracted from the larger number.
     * @param n1
     * @param n2
     * @return
     */
    public static int gcdOptimal(int n1, int n2){
        while (n1>0 && n2>0){
            if (n1>n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;  // reminder
            System.out.println("n1 :" + n1);
            System.out.println("n2 :" + n2);
        }
        if (n1==0)
            return n1;
        return n2;
    }

    public static int gcdRecursion(int n1, int n2){

        System.out.println(n1+":"+n2);
        if (n1==0)
            return n2;
        if (n2==0)
            return n1;
        if (n1==n2)
            return n1;
        if (n1>n2)
            return gcdRecursion(n1-n2,n2);
        else
            return gcdRecursion(n1,n2-n1);

    }

}
