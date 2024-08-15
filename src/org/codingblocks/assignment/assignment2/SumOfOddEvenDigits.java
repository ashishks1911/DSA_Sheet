package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

/***
 * Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
 *
 * Input Format
 * Constraints
 * 0 < N <= 1000000000
 *
 * Ex :
 * Input :              2   6   3   5
 *           position:  4   3   2   1
 * Output:
 * 11
 * 5
 *
 */
public class SumOfOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum=0, evenSum=0;
        boolean change = true;
        while (n!=0){
            if (change)
                oddSum += n%10;
            else
                evenSum += n%10;
            change = !change;
            n /= 10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }

    public static int countDigits(int n, int digit){
        int count=0;
        while (n!=0){
            if (digit==n%10)
                count++;
            n /=10;
        }
        return count;
    }

}


/***
 * Question :
 * Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
 *
 * Input Format
 * Constraints
 * 0 < N <= 1000000000
 *
 * Output Format
 * Sample Input
 * 2635
 * Sample Output
 * 11
 * 5
 * Explanation
 * 5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position.
 *
 * Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11
 *
 * Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5
 *
 *
 */