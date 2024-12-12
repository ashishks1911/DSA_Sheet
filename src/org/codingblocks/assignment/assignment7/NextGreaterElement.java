package org.codingblocks.assignment.assignment7;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        nextGreater(arr);
    }
    public static void nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                //next greater
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        for (int k : ans) {
            System.out.print(k + " ");
        }
    }
}
