package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class MaximumSumPathIn2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int[] nums1 = new int[n1];
            int[] nums2 = new int[n2];
            for (int i = 0; i < n1; i++) {
                nums1[i] = sc.nextInt();
            }
            for (int i = 0; i < n2; i++) {
                nums2[i] = sc.nextInt();
            }
            System.out.println(maxSum(nums1, nums2));
            t--;
        }

    }

    public static int maxSum(int[] nums1, int[] nums2) {
        int sum = 0, sum1 = 0, sum2 = 0;
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                sum1 += nums1[i];
                sum2 += nums2[j];
                sum = Math.max(sum1, sum2);
                sum1 = sum;
                sum2 = sum;
                i++;
                j++;
            }
            if (nums1[i] <= nums2[j]) {
                sum1 += nums1[i];
                i++;
            } else {
                sum2 += nums2[j];
                j++;
            }
        }
        while (i < nums1.length) {
            sum1 += nums1[i];
            i++;
        }
        while (j < nums2.length) {
            sum2 += nums2[j];
            j++;
        }
        return Math.max(sum1, sum2);
    }
}
