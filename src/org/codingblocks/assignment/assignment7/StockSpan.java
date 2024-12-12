package org.codingblocks.assignment.assignment7;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String args[])  {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        stockSpan(arr);
    }
    public static void stockSpan(int []arr){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i + 1;
            }else{
                ans[i] = i - st.peek();
            }
            st.push(i);
        }

        for(int k : ans){
            System.out.print(k+" ");
        }
        System.out.println("END");

    }
}
