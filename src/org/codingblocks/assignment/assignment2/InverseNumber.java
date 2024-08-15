package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

/****
 *
 * Ex : 32145
 * Output : 12543
 * Explanation :
 *      12543   (5 at 1st pos therefore 1 at 5th pos)
 *      12543   (4 at 2st pos therefore 2 at 4th pos)
 *
 * Logic :
 *               3       2       1       4        5
 *   pos :       5       4       3       2        1
 *
 *   for 1 => 3
 *   for 2 => 4 => 4*10 + 3 => 43
 *   for 3 => 5 => 5*100 + 43 => 543
 *   for 4 => 2 => 2*1000 + 543 => 2543
 *   for 5 => 1 => 1*10000 + 2543 => 12543
 *
 */
public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos[] = new int[10];
        int i=1;
        int count=0;
        while(n!=0){
            int rem = n%10;
            pos[rem]=i;
            i++;
            count++;
            n /=10;
        }
        int j=1;
        int sum=0;
        int mul=1;
        while(j<=count){
            sum += pos[j]*mul;
            mul *=10;
            j++;

        }
        System.out.println(sum);
    }

}






/***
 * Question :
 * Take the following as input.
 * A number
 * Assume that for a number of n digits, the value of each digit is from 1 to n and is unique.
 * E.g. 32145 is a valid input number.
 *
 * Write a function that returns its inverse, where inverse is defined as follows
 *
 * Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145,
 * “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
 *
 * Print the value returned.
 *
 * Input Format
 * Integer
 *
 * Constraints
 * 0 < N < 1000000000
 *
 * Output Format
 * Integer
 *
 * Sample Input
 * 32145
 * Sample Output
 * 12543
 * Explanation
 * Assume that for a number of n digits, the value of each digit is from 1 to n and is unique.
 * E.g. 32145 is a valid input number. Inverse of 32145 is 12543. In 32145, “5” is at 1st place,
 * therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543,
 * “2” is at 4th place.
 */