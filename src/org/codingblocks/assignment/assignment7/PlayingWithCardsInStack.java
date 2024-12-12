package org.codingblocks.assignment.assignment7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PlayingWithCardsInStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int q = s.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            st.push(x);
        }

        Stack<Integer> pileA = new Stack<>();
        Stack<Integer> pileB = new Stack<>();

        for (int i = 1; i <= q; i++) {
            int prime = primeNumber(i);
            while (!st.isEmpty()) {
                int x = st.pop();
                if (x % prime == 0) {
                    pileB.push(x);
                } else {
                    pileA.push(x);
                }
            }
        }

        while (!pileB.isEmpty()){
            System.out.println(pileB.pop());
        }

        while (!pileA.isEmpty()){
            System.out.println(pileA.pop());
        }
    }

    public static final int SIZE = 100000;

    public static int primeNumber(int n) {
        boolean prime[] = new boolean[SIZE + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;       //not prime
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i; i * j < prime.length; j++) {
                    prime[i * j] = false;
                }
            }
        }
        int count = 0;
        int k = 2;
        while (k < prime.length) {
            if (prime[k])
                count++;

            if (count == n)
                break;
            k++;
        }
        return k;
    }
}
