package org.codingblocks.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);    //to keep duplicates together
        combination(0, candidates, target, list, new ArrayList<Integer>());
        System.out.println(list);
    }

    public static void combination(int idx, int[] candidates, int target, List<List<Integer>> li, List<Integer> ans) {
        if (target == 0) {
            li.add(new ArrayList<>(ans));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (target >= candidates[i]) {
                ans.add(candidates[i]);
                combination(i + 1, candidates, target - candidates[i], li, ans);
                ans.remove(ans.size() - 1);
            }
        }
    }
}
