package org.ashish.interview.arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/majority-element/description/
 * https://www.geeksforgeeks.org/problems/majority-element-1587115620/1
 *
 */
public class P0_MajorityElement {
    public static void main(String[] args) {
        int []arr = {2,2,1,1,1,2,2};
        System.out.println(solution(arr,1));
        System.out.println(optimalSolution(arr));
    }

    //brute force
    public static int majorityElement(int[] arr){
        int ans = 0;
        for (int i=0; i<arr.length; i++){
            int count=0;
            for (int j=0; j<arr.length; j++){
                if (arr[j]==arr[i])
                    count++;
            }
            if (count>arr.length/2){
                ans = arr[i];
                break;
            }
        }
        return ans;
    }

    // nlogn : solved with an assumption that majority element is always present
    public static int solution(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }

    //with hashing T.C = O(n) , S.C = O(n)
    public static int solution(int[] arr, int size){
        if (size==1)
            return arr[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<size; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (Integer e : map.keySet()){
            if (map.get(e)>size/2)
                return e;
        }
        return -1;
    }

    //boyer moore majority voting algorithm
    public static int optimalSolution(int[] arr){
        int votes=0;
        int candidate = -1;
        for (int i=0; i<arr.length; i++){
            if (votes==0){
                candidate=arr[i];
                votes=1;
            }
            else if(arr[i]==candidate)
                votes++;
            else
                votes--;
        }

        //if array might not have a majority element : verify candidate
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==candidate) count++;
        }
        if (count>arr.length/2) return candidate;
        return -1;
    }


}
