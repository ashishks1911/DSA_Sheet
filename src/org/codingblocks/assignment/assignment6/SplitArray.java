package org.codingblocks.assignment.assignment6;

import java.util.*;

public class SplitArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5};
        Set<List<Integer>> ans = new HashSet<>();
        subset(arr,new ArrayList<Integer>(),ans,0);
        for (List<Integer> li : ans){
            if(li.stream().mapToInt(Integer::intValue).sum()==9)
                System.out.println(li);
        }

    }
    public static void subset(int []arr, List<Integer> li,Set<List<Integer>> ans, int idx){
        if (idx == arr.length){
            ans.add(new ArrayList<>(li));
            return;
        }
        li.add(arr[idx]);
        subset(arr, li, ans, idx + 1);
        li.remove(li.size() - 1);
        subset(arr,li, ans, idx + 1);
    }
}
