package org.ashish.hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.geeksforgeeks.org/problems/max-distance-between-same-elements/1
 */
public class _6_MaxDistanceBetweenSameElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    }
    public static int bruteForce(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i]==arr[j]) {
                    max = Math.max(j-i,max);
                }
            }
        }
        return max;
    }
    public static int maxDistance(int []arr){
        int len = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if (map.containsKey(arr[i])){
                len = Math.max(len, i-map.get(arr[i]));
            }else {
                map.put(arr[i],i);
            }
        }
        return len;
    }
}
