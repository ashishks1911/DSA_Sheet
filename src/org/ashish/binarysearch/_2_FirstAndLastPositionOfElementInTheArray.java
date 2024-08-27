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
}
