package org.codingblocks.blind45.arrays.part2;

public class SearchInARotatedSortedArray {
    public static void main(String[] args) {

        //brute force - linear search - O(N)

    }

    /**
     * Observation :
     *  when we rotate a sorted array it gets divided into 2 parts, sorted and unsorted.
     *  In binary search both the part are sorted but here it is not possible.
     *  Hence, we just need to identify which one is the sorted half
     *  then look if the target can be found in that sorted half. if not found eliminate the sorted half.
     *  Elimination is the core of binary search.
     *
     */
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                //left is sorted
                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // right is sorted
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
