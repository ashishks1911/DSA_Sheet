package org.ashish.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _16_FindthePrefixCommonArrayOf2Arrays {
    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        int ans[] = solution(A,B);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(optimalSolution(A,B)));
    }

    public static int[] solution(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
            int count = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > 1) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static int[] optimalSolution(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<>();
        int ans[] = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i])
                count++;
            else {
                if (set.contains(A[i]))
                    count++;
                if (set.contains(B[i]))
                    count++;
            }
            ans[i] = count;
            set.add(A[i]);
            set.add(B[i]);
        }
        return ans;
    }
}
