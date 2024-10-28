package org.codingblocks.lec33;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/sliding-window-maximum/description/
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int []ans =windowMaximum(arr,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] windowMaximum(int[] arr, int k){
        int n = arr.length;
        int [] maxVal = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();
        int j =0; // indicates at which index to add data for maxVal

        //1st window answer
        for(int i=0; i<k; i++){
            while (!dq.isEmpty() && arr[dq.getLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.add(i);
        }
        maxVal[j++]=arr[dq.getFirst()];

        for (int i=k; i<arr.length; i++){
            while (!dq.isEmpty() && arr[dq.getLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.add(i);

            //shrink
            if (!dq.isEmpty() && dq.getFirst()==i-k){
                dq.remove();    //removes first
            }

            //ans
            maxVal[j++]=arr[dq.getFirst()];
        }
        return maxVal;
    }
}
