package org.codingblocks.stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int arr[] = {3, 1, 6, 4, 18, 7, 5, 11, 19};
        System.out.println(Arrays.toString(arr));
        calculateSpan(arr);
    }

    public static void calculateSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            //span calculation
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
