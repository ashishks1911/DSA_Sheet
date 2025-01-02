package org.codingblocks.assignment.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://hack.codingblocks.com/app/contests/6641
 * Assignment on Recursion
 */
public class AllIndicesProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        indices(arr, 0, m, list);
        for(Integer e : list){
            System.out.print(e+" ");
        }

    }
    public static void indices(int []arr,int idx, int m, List<Integer> li){
        if(idx == arr.length)
            return;
        if(arr[idx] == m){
            li.add(idx);
        }
        indices(arr, idx + 1, m, li);
    }
}
