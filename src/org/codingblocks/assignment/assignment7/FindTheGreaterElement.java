package org.codingblocks.assignment.assignment7;

import java.util.Arrays;
import java.util.Stack;

public class FindTheGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 2};
        nextGreater(arr);
    }

    public static void nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < 2 * n; i++) {
            while (!st.isEmpty() && arr[i % n] > arr[st.peek()]) {
                //next greater
                ans[st.pop()] = arr[i % n];
            }
            if (i < n)
                st.push(i % n);
        }
        for (int k : ans) {
            System.out.print(k + " ");
        }
    }
}
