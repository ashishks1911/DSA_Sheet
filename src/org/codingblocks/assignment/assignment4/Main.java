package org.codingblocks.assignment.assignment4;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [][]arr = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        wavePrintColumnWise(arr);
    }
    public static void wavePrintColumnWise(int arr[][]){
        for (int col=0; col<arr.length; col++){
            if (col%2==0) {
                for (int row = 0; row < arr[0].length; row++) {
                    System.out.print(arr[row][col]+", ");
                }
            }else{
                for (int row = arr[0].length-1; row>=0; row--){
                    System.out.print(arr[row][col]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
