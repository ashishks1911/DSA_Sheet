package org.codingblocks.assignment.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class MurthalParantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();   //no. of parantha ordered
        int l = sc.nextInt();   //no. of cooks
        int rank[] = new int[l];   //rank of each cook
        for (int i = 0; i < l; i++) {
            rank[i] = sc.nextInt();
        }
        System.out.println(timeNeeded(rank,p));
    }

    public static int timeNeeded(int[] rank, int parantha) {
        int[] timeArr = new int[rank.length];
        int prefix[] = rank.clone();
        while (parantha!=0) {
            int mini = minimumTime(prefix);
            for (int j = 0; j < rank.length; j++) {
                if (mini == prefix[j]) {
                    parantha--;
                    timeArr[j] += rank[j];
                    prefix[j]+=timeArr[j];
                    break;
                }
            }
        }
        for (int i=0; i<rank.length; i++){
            prefix[i] -= rank[i];
        }
        System.out.println(Arrays.toString(prefix));
        int max = Integer.MIN_VALUE;
        for (int i=0; i<prefix.length; i++){
            if (prefix[i]>max){
                max = prefix[i];
            }
        }
        return max;
    }

    public static int minimumTime(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
