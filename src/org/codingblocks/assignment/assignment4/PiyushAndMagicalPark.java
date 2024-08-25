package org.codingblocks.assignment.assignment4;

import java.util.Scanner;

public class PiyushAndMagicalPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();   //rows
//        int M = sc.nextInt();   //columns
//        char[][] arr = new char[N][M];
//        int K = sc.nextInt();   //strength piyush needs
//        int S = sc.nextInt();   //strength piyush has
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < M; j++) {
//                arr[i][j] = sc.next().charAt(0);
//            }
//        }
        int K = 5;
        int S = 20;

        char arr[][] = {
                {'.', '.', '*', '.'},
                {'.', '#', '.', '.'},
                {'*', '*', '.', '.'},
                {'.', '#', '*', '*'}
        };
        boolean win = true;
        for (int i = 0; i < arr.length; i++) {
                if (S<K){
                    win = false;
                    break;
                }
            for (int j = 0; j < arr[0].length; j++) {
                if (S<K){
                    win=false;
                    break;
                }
                if (arr[i][j] == '.') {
                    S -= 2;
                } else if (arr[i][j] == '*') {
                    S += 5;
                }
                else {
                    break;
                }
                if (j!=arr[0].length-1)
                    S--;
            }
        }

        if (win){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(S);

    }

}
