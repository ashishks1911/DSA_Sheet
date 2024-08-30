package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class PaintersPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();   //no. of painters
        int n = sc.nextInt();
        int[] boards = new int[n];
        for (int i=0; i<n; i++){
            boards[i] = sc.nextInt();
        }
        System.out.println(binarySearch(boards,k));
    }

    public static int binarySearch(int[] boards, int k){
        int lo = max(boards);
        int hi = sum(boards);
        int ans=0;
        while (lo<=hi){
            int mid = lo+ (hi-lo)/2;
            if (studentsNeeded(boards, mid)>k){
                lo=mid+1;
            }
            else {
                ans=mid;
                hi = mid-1;
            }
        }
        return ans;
    }

    public static int  studentsNeeded(int []boards, int maxBoard){
        int painter =1;
        int pageCount=0;
        for (int i=0; i<boards.length; i++){
            if (pageCount+boards[i] <=maxBoard){
                pageCount+=boards[i];
            }else {
                painter++;
                pageCount=boards[i];
            }
        }
        return painter;
    }


    public static int sum(int[] arr) {
        int sum=0;
        for (int e : arr){
            sum+=e;
        }
        return sum;
    }

    public static int max(int []arr) {
        int max = Integer.MIN_VALUE;
        for (int e : arr){
            max = Math.max(max,e);
        }
        return max;
    }
}
