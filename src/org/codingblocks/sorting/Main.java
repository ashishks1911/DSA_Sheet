package org.codingblocks.sorting;

import java.util.Scanner;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int ans[] = square(arr,n);

        for (int k=0;k<ans.length;k++){
            System.out.print(ans[k]+" ");
        }

    }
    public static int[] square(int []arr,int n) {
        int[] squareArray = new int[n];

        for (int i = 0; i < squareArray.length; i++) {
            squareArray[i] = arr[i] * arr[i];
        }
        for (int turn = 1; turn < squareArray.length; turn++) {
            for (int i = 0; i < squareArray.length - turn; i++) {
                if (squareArray[i] > squareArray[i + 1]) {
                    int temp = squareArray[i];
                    squareArray[i] = squareArray[i + 1];
                    squareArray[i + 1] = temp;
                }
            }
        }
        return squareArray;
    }
}