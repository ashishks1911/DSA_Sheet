package org.codingblocks.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr){
        for (int turn =1; turn<arr.length; turn++){
            for (int i=0; i<arr.length-turn; i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i+1]=arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
