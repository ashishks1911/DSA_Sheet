package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class RatChasesItsCheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        int [][] ans = new int[n][m];
        path(arr, 0, 0, ans);
        if (!flag){
            System.out.println("NO PATH FOUND");
        }
    }
    public static boolean flag = false;
    public static void path(char[][] arr, int cr, int cc, int[][] ans) {
        if (cr>=arr.length || cc>=arr[0].length || cr<0 || cc <0 || arr[cr][cc]=='X'){
            return;
        }
        if (cr==arr.length-1 && cc == arr[0].length - 1){
            ans[cr][cc] = 1;
            display(ans);
            return;
        }
        arr[cr][cc] = 'X';
        ans[cr][cc] = 1;
        path(arr, cr, cc + 1, ans);   //right
        path(arr, cr, cc - 1, ans);   //left
        path(arr, cr + 1, cc, ans);   //down
        path(arr, cr - 1, cc, ans);   //top
        arr[cr][cc] = 'O';
        ans[cr][cc] = 0;

    }
    public static void display(int [][] ans){
        for (int i=0; i<ans.length; i++){
            for (int j=0; j<ans[0].length ; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
