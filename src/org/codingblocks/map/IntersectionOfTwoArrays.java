package org.codingblocks.map;

import java.util.*;
import java.util.HashMap;

/***
 * Intersection of Two Arrays II
 *
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 5 }, nums2 = { 9, 4, 9, 8, 4 };
        int [] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            res[i] = list.get(i);

        return res;
    }
}
