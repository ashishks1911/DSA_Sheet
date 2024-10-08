package org.codingblocks.sorting;

/***
 *
 * https://www.spoj.com/problems/AGGRCOW/
 *
 *
 */
public class FirstBadVersion {
    public static void main(String[] args) {

    }

    //Dummy API Calls
    public static boolean isBadVersion(int n){
        return false;
    }

    public static int firstBadVersion(int n){
        int lo =1;
        int hi = n;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isBadVersion(mid)){
                ans =mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
}
