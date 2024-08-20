package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

/**
 * Input :
 * 2
 * 3
 * 1 2 3
 * 3
 * 3 2 1
 *
 * Output :
 * 1 3 2
 * 1 2 3
 *
 *
 * sort :
 * [1 2 3]
 * [1 3 2] swap [1][2]
 * [2 1 3] swap [1][0]
 * [2 3 1] swap [0][1]
 * [3 2 1] swap [1][0]
 * [3 1 2] swap [1][2]
 *
 */
public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits[] = new int[n];
        for (int i=0; i<n; i++){
            digits[i] = sc.nextInt();
        }

    }
    // all possible permutation
    public static void permutations(int []arr){
        
    }

}
