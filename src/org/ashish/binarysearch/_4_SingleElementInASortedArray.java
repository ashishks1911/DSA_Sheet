package org.ashish.binarysearch;

public class _4_SingleElementInASortedArray {
    public static void main(String[] args) {
        int []arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleElement(arr));
    }

    public static int singleElement(int arr[]){
        int lo = 0, hi = arr.length-1;
        while (lo<=hi){
            int mid  = lo + (hi-lo)/2;
            if (lo==hi){
                return arr[lo];
            }
            if (mid%2==0){
                //even odd => single element is on right side
                if (arr[mid]==arr[mid+1])
                    lo=mid+1;
                else
                    hi=mid;
            }
            else {
                //odd even => single element is on left side
                if (arr[mid]==arr[mid-1]){
                    lo = mid+1;
                }
                else
                    hi=mid;
            }
        }
        return -1;
    }
}
