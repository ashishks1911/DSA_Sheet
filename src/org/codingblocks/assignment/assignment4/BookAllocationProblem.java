package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class BookAllocationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pages = new int[n];
        for (int i=0; i<n; i++){
            pages[i] = sc.nextInt();
        }
        System.out.println(binarySearch(pages,m));
    }

    public static int binarySearch(int[] pages, int m){
        int lo = max(pages);
        int hi = sum(pages);
        int ans=0;
        while (lo<=hi){
            int mid = lo+ (hi-lo)/2;
            if (studentsNeeded(pages, mid)>m){
                lo=mid+1;
            }
            else {
                ans=mid;
                hi = mid-1;
            }
        }
        return ans;
    }

    public static int  studentsNeeded(int []pages, int maxPages){
        int student =1;
        int pageCount=0;
        for (int i=0; i<pages.length; i++){
            if (pageCount+pages[i] <=maxPages){
                pageCount+=pages[i];
            }else {
                student++;
                pageCount=pages[i];
            }
        }
        return student;
    }


    public static int sum(int[] pages) {
        int sum=0;
        for (int e : pages){
            sum+=e;
        }
        return sum;
    }

    public static int max(int []pages) {
        int max = Integer.MIN_VALUE;
        for (int e : pages){
            max = Math.max(max,e);
        }
        return max;
    }

}
