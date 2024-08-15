package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class RunningSumOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int e : runningSum(arr)){
            System.out.print(e+" ");
        }
    }

    public static int[] runningSum(int[] nums){
        int[] ans= new int[nums.length];
        int sum=0;
        for (int i=0; i<nums.length; i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
