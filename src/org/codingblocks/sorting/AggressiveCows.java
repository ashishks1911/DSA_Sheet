package org.codingblocks.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int nos = sc.nextInt();  // no. of stalls
            int noc = sc.nextInt(); //no. of cows
            int[] stall = new int[nos];
            for (int i = 0; i < nos; i++) {
                stall[i] = sc.nextInt();
            }

            Arrays.sort(stall);
            System.out.println(largest_minimum(stall,noc));
            t--;
        }

    }

    public static int largest_minimum(int[] stall, int noc){
        int lo=0;
        int hi = stall[stall.length-1]-stall[0];
        int ans = 0;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (isItPossible(stall,noc,mid)){
                ans=mid;
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int[] stall, int noc, int mid) {
        int cow=1;
        int pos=1;
        for (int i=1; i<stall.length;i++){
            if (stall[i] - pos >= mid){
                cow++;
                pos=stall[i];
            }
            if (cow==noc){
                return true;
            }
        }
        return false;
    }


}
