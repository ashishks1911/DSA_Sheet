package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/***
 *
 * INPUT :
 * 5
 * 1 3 4 2 5
 * 5
 *
 * OUTPUT :
 *
 * 1 and 4
 * 2 and 3
 *
 */
public class ArraysTargetSumPairs {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        pairs(arr,target);
    }

    public static void pairs(int[] arr, int target){

        for (int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]+arr[j]==target){
                    if (arr[i]<arr[j])
                        System.out.println(arr[i]+" and "+arr[j]);
                    else
                        System.out.println(arr[j]+" and "+arr[i]);
                }
            }
        }
    }
}
