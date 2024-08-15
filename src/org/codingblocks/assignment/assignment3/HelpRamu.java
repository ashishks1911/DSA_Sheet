package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 *  cost of tickets
 *  c1 = for 1 ride on rickshaw or cab
 *  c2 = for unlimited rides on some rickshaw or cabs
 *  c3 = for unlimited rides on all rickshaw or cabs
 *  c4 = for unlimited rides on all rickshaw and cabs
 *
 * INPUT:
 * 1
 * 1 3 7 19
 * 2 3
 * 2 5
 * 4 4 4
 *
 * OUTPUT:
 * 12
 *
 */
public class HelpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // testcases
        while (t>0) {
            int cost[] = new int[5];
            for (int i = 1; i < 5; i++) {
                cost[i] = sc.nextInt();
            }

            int n = sc.nextInt(); // no. of rickshaws ramu will use
            int m = sc.nextInt(); // no. of cabs ramu will use
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); // no.of times rickshaw used by ramu
            }
            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt(); // no.of times cabs used by ramu
            }
            System.out.println(minimumCost(cost,a,b));
            t--;
        }

    }

    public static int minimumCost(int c[], int[] a, int[] b){
        //cost of rickshaw
        int cost =0;
        for (int i=0; i<a.length; i++){
            cost+= Math.min(c[1]*a[i],c[2]);
        }
        int minimumRickshawCost = Math.min(cost,c[3]);

        //cost of cabs
        int sum =0;
        for (int i=0; i<b.length; i++){
            sum+= Math.min(c[1]*b[i],c[2]);
        }
        int minimumCabCost = Math.min(sum,c[3]);
        return Math.min(minimumRickshawCost+minimumCabCost,c[4]);
    }
}
