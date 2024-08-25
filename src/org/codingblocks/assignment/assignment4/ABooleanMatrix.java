package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class ABooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        booleanMatrix(arr);
        display(arr);

    }

    public static void booleanMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean exist = false;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    for (int row = 0; row < arr.length; row++) {
                        arr[row][j] = 1;
                    }
                    exist = true;
                    break;
                }
            }
            if (exist) {
                for (int col = 0; col < arr[i].length; col++) {
                    arr[i][col] = 1;
                }
            }
            display(arr);
            System.out.println("---------------------------");
        }
    }

    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
