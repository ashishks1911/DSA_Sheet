package org.codingblocks.assignment.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubsetProblem {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int ans = subsequence(arr, 0, list, target);
        System.out.println();
        System.out.println(ans);
    }

    public static int subsequence(int[] arr, int idx, List<Integer> li, int target) {
        if (idx == arr.length) {
            if (subsequenceSum(li) == target) {
                for (int e : li) {
                    System.out.print(e + " ");
                }
                System.out.print(" ");
                return 1;
            }
            return 0;
        }
        li.add(arr[idx]);           //take
        int t1 = subsequence(arr, idx + 1, li, target);
        li.remove(li.size() - 1);        //don't take
        int t2 = subsequence(arr, idx + 1, li, target);
        return t1 + t2;
    }

    public static int subsequenceSum(List<Integer> li) {
        int sum = 0;
        for (int i : li) {
            sum += i;
        }
        return sum;
    }

}

