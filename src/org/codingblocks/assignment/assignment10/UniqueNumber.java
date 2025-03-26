package org.codingblocks.assignment.assignment10;
import java.util.*;

/**
 * Single Number I
 */
public class UniqueNumber {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }
        System.out.println(xor);
    }

}
