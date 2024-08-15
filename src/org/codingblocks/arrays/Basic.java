package org.codingblocks.arrays;

/****
 * Date : 27 July 2024
 *
 * stack - executes function frames
 * non-primitive is stored in heap memory
 *
 * default for int type array is 0.
 * int []arr = new int[5] => creates 5 buckets of 4 bytes => occupies 20 bytes
 *
 * prints arr =>
 *
 * Q Java call bh value or call by reference ?
 *
 *
 */
public class Basic {
    public static void main(String[] args) {
//        int []arr = new int[5];
//        System.out.println(arr.length);
        int []arr = new int[]{10, 20, 30, 40, 50};
        int []other = {100, 200, 300, 400, 9};
        System.out.println(arr[0]+" "+other[0]);
        swap(arr,other);
        System.out.println(arr[0]+" "+other[0]);
    }
    public static void swap(int[] arr, int[] other){
        int [] temp = arr;
        arr=other;
        other=temp;
    }

    public static void max(int []arr){
        int max = arr[0];
        for (int i=0; i<arr.length; i++){
            if (arr[i]<max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
