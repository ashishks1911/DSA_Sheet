package org.ashish.interview.hashing.seta;

import java.util.HashMap;

public class P6_SumOfElementsWithFreqEqualOrGreaterThanItself {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 1, 6};
        System.out.println(solution(arr));
    }

    public static int solution(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int sum = 0;
        for (Integer key : map.keySet()) {
            if (key <= map.get(key)) {
                sum += key;
            }
        }
        return sum;
    }
}
