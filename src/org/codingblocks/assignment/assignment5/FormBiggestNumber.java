package org.codingblocks.assignment.assignment5;

import java.util.*;

public class FormBiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t>0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(largestNumber(arr));
            t--;
        }
    }

    public static String largestNumber(int[] arr) {
        String[] strArr = new String[arr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String t1, String t2) {
                return t1.compareTo(t2);
            }
        };

        Arrays.sort(strArr,comparator.reversed());
        String ans ="";
        for (String s:strArr){
            ans+=s;
        }
        return ans;
    }


}
