package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class HowManyQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] problems = new int[n][3];
        for (int i=0; i<problems.length; i++){
            for (int j=0; j<problems[0].length; j++){
                problems[i][j]=sc.nextInt();
            }
        }
        System.out.println(count(problems));

    }

    public static int count(int[][] problems){
        int ans=0;
        for (int i=0; i<problems.length; i++){
            int count=0;
            for (int j=0; j<problems[0].length; j++){
                if (problems[i][j]==1)
                    count++;
            }
            if (count>1)
                ans++;
        }
        return ans;
    }
}
