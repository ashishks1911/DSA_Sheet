package org.ashish.interview.hashing.seta;

import java.util.HashMap;

public class P0_CountingFrequencyOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
        bruteForce(arr);
        System.out.println("----------------------");
        hashingSolution(arr);

    }

    public static void bruteForce(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i])
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " : " + count);
        }
    }

    public static void hashingSolution(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length ; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for (Integer key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
