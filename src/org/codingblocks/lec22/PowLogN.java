package org.codingblocks.lec22;

public class PowLogN {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(pow(a, n));
    }

    public static int pow(int a, int n) {
        if (n == 0)
            return 1;
        int ans = pow(a, n / 2);
        ans = ans * ans;
        if (n % 2 != 0)
            ans *= a;

        System.out.println(n +" : "+ ans);
        return ans;
    }

}
