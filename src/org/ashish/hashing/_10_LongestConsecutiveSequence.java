package org.ashish.hashing;

import java.util.HashMap;

public class _10_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {0, 3, 7, 2, 5, 8,4,6, 0, 1};
        System.out.println(longestConsecutive(arr));
        System.out.println(longestConsecutive(arr,arr.length));
    }

    //with 2 hashMap
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> present = new HashMap<>();
        HashMap<Integer, Boolean> checked = new HashMap<>();

        for (int k : nums) {
            present.put(k, true);
        }
        int longest = 0;
        for (int num : nums) {

            if (!checked.containsKey(num) && !present.containsKey(num - 1)) {
                int start = num;
                int count = 0;
                while (present.containsKey(start)) {
                    start++;
                    checked.put(start, true);
                    count++;
                }
                if (count > longest)
                    longest = count;
            }
        }
        return longest;
    }

    //With 1 hashMap
    public static int longestConsecutive(int[] nums, int n) {
        HashMap<Integer, Boolean> hmap = new HashMap<>();

        for (int k : nums) {
            hmap.put(k, true);
        }
        int longest = 0;
        for (int num : nums) {
            if (hmap.containsKey(num - 1))
                hmap.put(num, false);
        }

        for (int num : nums) {

            if (hmap.get(num) == true) {
                int start = num;
                int count = 0;
                while (hmap.containsKey(start)) {
                    start++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
