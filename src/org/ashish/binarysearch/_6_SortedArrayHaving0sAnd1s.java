package org.ashish.binarysearch;

/**
 * Given a sorted array of 0’s and 1’s find the first occurrence of 1 .
 */
public class _6_SortedArrayHaving0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 1};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == 0) {
                if (mid == arr.length - 1) {
                    return -1;
                }
                if (arr[mid + 1] == 1)
                    return mid + 1;
                else
                    lo = mid + 1;

            } else {
                if (mid == 0) {
                    return mid;
                }
                if (arr[mid - 1] == 0)
                    return mid;
                else
                    hi = mid - 1;
            }
        }
        return -1;
    }
}
