package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(search(arr, m, 0));
    }

    public static int search(int []arr, int m, int idx){
        if(idx == arr.length)
            return -1;
        if(arr[idx] == m)
            return idx;
        return search(arr, m, idx + 1);
    }
}
