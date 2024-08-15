package org.codingblocks.sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 9, 11, 13, 14, 15, 18, 20, 21};
        int item =13;
        System.out.println(search(arr,14));
        System.out.println(kthRoot(148,3));

    }

    public static int search(int[] arr, int item){
        int lo = 0;
        int hi = arr.length-1;
        while (lo<=hi){
            int mid =  lo + (hi -lo)/2;   // (lo + hi)/2;
            if (arr[mid]==item)
                return mid;
            else if (arr[mid]<item)
                lo = mid+1;
            else
                hi=mid-1;
        }
        return -1;
    }

    /***
     * Equation = x^k <= N
     * Ex:  x^3<=148
     *
     */
    public static int kthRoot(int N, int k){
        int lo = 0;
        int hi = N;
        int ans = 0;
        while (lo<=hi){
            int mid = lo + (hi - lo)/2;
            if(Math.pow(mid,k)<=N){
                ans = mid;
                lo = mid+1;
            }
            else {
                hi = mid-1;
            }
        }
        return ans;
    }
}
