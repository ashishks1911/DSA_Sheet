package org.codingblocks.blind45.arrays.part1;


import java.util.HashMap;

/**
 * CP : PigeonHole Principle
 */
public class DivisibleSubarrays {
    public static int bruteForce(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int optimalApproach(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = ((sum + nums[i]) % k + k) % k;     // k is added to make the modulo positive in all cases
            count += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}
