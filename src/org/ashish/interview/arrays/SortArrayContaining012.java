package org.ashish.interview.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/sort-colors/description/
 *
 */
public class SortArrayContaining012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums){
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
