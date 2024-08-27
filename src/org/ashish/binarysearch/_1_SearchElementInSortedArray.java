package org.ashish.binarysearch;

/**
 * https://leetcode.com/problems/binary-search/description/
 */
public class _1_SearchElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,7,7,10,10,20,25,25,30,30,40,50};
        System.out.println(binarySearch(arr,30));

    }
    public static boolean binarySearch(int arr[], int target){
        int l=0;
        int r=arr.length-1;
        while (l<r){
            int mid = l + (r-l)/2;
            if (arr[mid]>target)
                r = mid-1;
            else if(arr[mid]<target)
                l = mid+1;
            else
                return true;
        }
        return false;
    }

}
