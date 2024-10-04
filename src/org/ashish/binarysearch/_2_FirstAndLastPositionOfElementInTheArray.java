package org.ashish.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class _2_FirstAndLastPositionOfElementInTheArray {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        int []ans = search(arr,8);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] search(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int l = 0;
        int r = nums.length - 1;
        int fo = -1, lo = -1;
        // for first occurence
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target)
                r = mid - 1;
            else if (nums[mid] < target)
                l = mid + 1;
            else {
                fo = mid;
                r = mid - 1;
            }
        }

        l = 0;
        r = nums.length - 1;
        //for last occurence
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target)
                r = mid - 1;
            else if (nums[mid] < target)
                l = mid + 1;
            else {
                lo = mid;
                l = mid + 1;
            }
        }
        return new int[]{fo, lo};

    }
    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int lb = lowerBound(arr, n, k);
        if(lb == n || arr.get(lb)!=k)
            return new int[]{-1,-1};
        int ub = upperBound(arr, n, k)-1;
        return new int[]{lb,ub};

    }

    public static int lowerBound(ArrayList<Integer> arr, int n, int k){
        int low = 0, high = n-1;
        int ans = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr.get(mid)>=k){
                ans=mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int upperBound(ArrayList<Integer> arr, int n, int k){
        int low = 0, high = n-1;
        int ans = n;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr.get(mid)>k){
                ans=mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
