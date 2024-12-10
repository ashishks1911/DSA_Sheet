package org.codingblocks.stack;

import java.util.Stack;

/**
 * Given an array, print the Next Greater Element (NGE) for every element.The Next Greater Element
 * for an element x is the first greater element on the right side of x in array. Elements for which
 * no greater element exist, consider next greater element as -1.
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {11, 9, 13, 21, 3};
//        nextLarger(arr);
        nextGreaterElement(arr);
    }

    // brute force approach - TLE
    public static void nextLarger(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            int j = i + 1;
            while (j < arr.length) {
                if (arr[i] < arr[j]) {
                    found = true;
                    break;
                }
                j++;
            }
            if (found) {
                System.out.println(arr[i] + "," + arr[j]);
            } else {
                System.out.println(arr[i] + ",-1");
            }
        }
    }

    //optimal approach
    public static void nextGreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int []ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                //next greater
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            ans[st.pop()] = -1;
        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]+","+ans[i]);
        }
    }
}
