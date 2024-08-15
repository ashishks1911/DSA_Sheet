package org.codingblocks.assignment.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int[] roses = new int[n];
            for (int i = 0; i < n; i++) {
                roses[i] = sc.nextInt();
            }
            int money = sc.nextInt();
            int[] ans = chooseRosePair(roses, money);
            System.out.println("Deepak should buy roses whose prices are " + ans[0] + " and " + ans[1] + ".");
            t--;
        }
    }

    public static int[] chooseRosePair(int[] arr, int money){
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        int []ans = new int[2];
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==money){
                    int diff = Math.abs(arr[i]-arr[j]);
                    if (mini>diff){
                        mini=diff;
                        ans[0]=arr[i];
                        ans[1]=arr[j];
                    }
                }
            }
        }
        return ans;
    }
}
