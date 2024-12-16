package org.codingblocks.bitmanupulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 5};
        System.out.println((Arrays.toString(singleNumber(arr))));
    }

    public static int[] singleNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        int mask = (ans & (~(ans - 1)));
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & mask) != 0) {
                a = a ^ arr[i];
            }
        }

        int b = ans ^ a;        //ans  => a^b^a = b4
        int[] ar = {a, b};
        return ar;
    }
}
