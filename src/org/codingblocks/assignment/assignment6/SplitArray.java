package org.codingblocks.assignment.assignment6;

import java.util.*;

public class SplitArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5};
        int sum = Arrays.stream(arr).sum();
        if (sum%2==0) {
            printSplits(arr, new ArrayList<>(), new ArrayList<>(), 0,0,0);
            int count = countEqualSplits(arr, 0, 0, 0);
            System.out.println(count);
        }
        else {
            System.out.println(0);
        }

    }

    public static int countEqualSplits(int []arr, int sum1, int sum2, int idx){
        if (idx==arr.length){
            return sum1==sum2 ? 1 : 0;
        }
        int group1Count = countEqualSplits(arr, sum1+arr[idx], sum2, idx + 1);
        int group2Count = countEqualSplits(arr, sum1, sum2+arr[idx], idx + 1);
        return group1Count + group2Count;
    }

    public static void printSplits(int []arr, List<Integer> group1, List<Integer> group2, int sum1, int sum2, int idx){
        if (idx==arr.length){
            if (sum1==sum2){
                for (int e : group1){
                    System.out.print(e+" ");
                }
                System.out.print("and ");
                for (int e: group2){
                    System.out.print(e+" ");
                }
                System.out.println();
            }
            return;
        }
        group1.add(arr[idx]);
        printSplits(arr, group1, group2, sum1+arr[idx], sum2, idx + 1);
        group1.remove(group1.size() - 1);

        group2.add(arr[idx]);
        printSplits(arr, group1, group2, sum1, sum2+arr[idx], idx + 1);
        group2.remove(group2.size() - 1);

    }
}
