package org.ashish.binarysearch;

public class _5_NthRootOfM {
    public static void main(String[] args) {
        System.out.println(NThRoot(3,125));
    }

    /*
        T.C = O(N*logM)
     */
    public static int NThRoot(int n, int m){
        int low =0;
        int high = m;
        while (low<=high){
            int mid = low + (high - low)/2;
            if(Math.pow(mid,n)>m){
                high = mid-1;
            }
            else if (Math.pow(mid,n)<m){
                low = mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}
