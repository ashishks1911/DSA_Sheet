package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count++;
            }
            if (count > arr.length / 2) {
                ans = arr[i];
                break;
            }
        }
        return ans;
    }
}
