package org.codingblocks.assignment.assignment7;

import java.util.*;

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
        List<Stack<Integer>> pileBList = new ArrayList<>();
        List<Integer> primes = primeNumbers();

        for (int i = 0; i < q; i++) {
            int prime = primes.get(i);
            Stack<Integer> pileB = new Stack<>();
            while (!st.isEmpty()) {
                int x = st.pop();
                if (x % prime == 0) {
                    pileB.push(x);
                } else {
                    pileA.push(x);
                }
            }
            st.clear();
            for (int val : pileA){
                st.push(val);
            }
            pileBList.add(pileB);
            pileA.clear();
        }


        for (Stack<Integer> pileB : pileBList) {
            while (!pileB.isEmpty()) {
                System.out.println(pileB.pop());
            }
        }
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    public static final int SIZE = 100000;

    public static List<Integer> primeNumbers() {
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
        ArrayList<Integer> list = new ArrayList<>();
        for (int k = 2; k < prime.length; k++) {
            if (prime[k])
                list.add(k);
        }
        return list;
    }
}
