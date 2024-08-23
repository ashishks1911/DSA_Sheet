package org.ashish.hashing;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/description/
 * assumption : each input has exactly one solution
 */
public class _4_TwoSum {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 5};
        int ans[] = bruteForce(arr,9);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(betterSolution(arr,9)));
    }
    //naive approach
    public static int[] bruteForce(int[] nums, int target){
        int n = nums.length;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    /*
        T.C = O(N)
        S.C = O(N)
     */
    public static int[] betterSolution(int nums[], int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean result = false;
        for(int i=0; i<nums.length; i++){
            int val = target-nums[i];
            if(map.containsKey(val)){
                return new int[]{map.get(val), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    /*
        T.C = O(N)+O(N*logN)
        S.C = O(1)
     */
    public boolean optimalSolution(int[] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int sum = arr[i]+arr[j];
            if (sum==target)
                return true;
            else if(sum<target)
                i++;
            else
                j--;
        }
        return false;
    }
    /*
        T.C = O(N)+O(N*logN)
        S.C = O(N)
        Hashing approach is better when indices are required for answer.
     */
    public static int[] optimalSolution2(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int sum = arr[i]+arr[j];
            if (sum==target)
                return new int[]{map.get(arr[i]),map.get(arr[j])};
            else if(sum<target)
                i++;
            else
                j--;
        }
        return new int[]{-1,-1};
    }

}
