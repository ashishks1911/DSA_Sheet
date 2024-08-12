package org.ashish.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 */
public class MajorityElement {
    public static void main(String[] args) {

        int []arr = {15};
        System.out.println(solution(arr,1));
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



}
