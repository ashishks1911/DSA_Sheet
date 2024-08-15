package org.codingblocks.assignment.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int []result = squareAndSort(nums);
        for (int i : result){
            System.out.print(i+" ");
        }
    }

    public static int[] squareAndSort(int[] nums){
        for (int i=0; i<nums.length; i++){
            nums[i]= nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    //Insertion sort : takes an element and places it in its correct position
    public static void sort(int[] arr){

    }


}
