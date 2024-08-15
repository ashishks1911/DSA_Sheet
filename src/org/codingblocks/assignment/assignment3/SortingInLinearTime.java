package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class SortingInLinearTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt();
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sortColors(int[] nums) {
        // Write your code here
        int zero = 0, one = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            else if (nums[i] == 1)
                one++;
        }

        int i=0;
        int counter=0;
        while (counter<zero){
            nums[i]=0;
            counter++;
            i++;
        }

        counter=0;
        while (counter<one){
            nums[i]=1;
            counter++;
            i++;
        }

        while (i<nums.length){
            nums[i]=2;
            i++;
        }
    }

}
