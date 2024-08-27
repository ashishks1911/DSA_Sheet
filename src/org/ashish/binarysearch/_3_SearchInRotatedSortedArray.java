package org.ashish.binarysearch;

public class _3_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        //return the index of target
        System.out.println(binarySearch(arr, 0));

    }

    public static int binarySearch(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                return mid;

            } else if (arr[mid] >= arr[0]) {     //1st increasing sequence
                if (arr[mid] < target || target < arr[0])
                    low = mid + 1;
                else
                    high = mid - 1;
            } else {
                if (arr[mid] > target || arr[arr.length - 1] < target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
        }
        return -1;
    }


}
