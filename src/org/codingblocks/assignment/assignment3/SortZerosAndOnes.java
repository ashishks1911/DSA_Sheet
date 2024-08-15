package org.codingblocks.assignment.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int []arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
//        int []arr = {1, 0, 0, 1, 1, 0, 1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int []arr){
        int count=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==0)
                count++;
        }
        int i=0;
        while (i<arr.length){
            if (i<count)
                arr[i]=0;
            else
                arr[i]=1;
            i++;
        }
    }
    public static void sort2(int []arr){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]==1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            else{
                i++;
            }
        }
    }



}
