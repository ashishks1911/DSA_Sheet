package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        System.out.println((optimalSolution(arr, target)));
    }

    /**
     * T.C = O(N*logM)
     * @param arr
     * @param target
     * @return
     */
    public static int search(int [][]arr, int target){
        for (int i=0; i<arr.length; i++){
            if (binarySearch(arr[i],target)){
                return 1;
            }
        }
        return 0;

    }

    public static boolean binarySearch(int []arr,int target){
        int l = 0;
        int h = arr.length-1;
        while (l<=h){
            int mid = l + (h-l)/2;
            if (arr[mid]>target)
                h = mid-1;
            else if(arr[mid]<target)
                l = mid+1;
            else
                return true;
        }
        return false;
    }

    public static boolean optimalSolution(int [][]matrix, int target){
        int row = matrix.length-1;
        int col = 0;
        while (row>=0 && col<matrix[0].length){
            if (matrix[row][col]==target){
                return true;
            }
            else if (matrix[row][col]<target) {
                col++;
            }
            else
                row--;

        }
        return false;
    }
}
