package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 * Example :
 * Input :
 * [3 0 0 2 0 4]
 *
 * Output: 6
 *
 * Logic :
 *          [3 0 0 2 0 4]
 *
 * left :   [3 3 3 3 3 4]
 * right :  [4 4 4 4 4 4]
 *
 * Use : minimum (left, right) - arr
 *          [3 3 3 3 3 4]
 *        - [3 0 0 2 0 4]
 * -------------------------
 *          [0 3 3 1 3 0] = 3 + 3 + 1 + 3 = 10
 */
public class RainWaterTrapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(waterTrapped(arr));
            t--;
        }
    }
    public static int waterTrapped(int[] arr){
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int max =arr[0];
        for (int i=0; i<n; i++){
            max = Math.max(arr[i],max);
            left[i] = max;
        }
        max =arr[n-1];
        for (int i=n-1; i>=0; i--){
            max = Math.max(arr[i],max);
            right[i] = max;
        }
        int ans=0;
        for (int i=0; i<n; i++){
            ans += Math.min(left[i],right[i]) -arr[i];
        }
        return ans;
    }
}
