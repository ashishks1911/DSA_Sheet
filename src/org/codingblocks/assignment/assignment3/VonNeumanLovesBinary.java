package org.codingblocks.assignment.assignment3;

import java.util.Scanner;

public class VonNeumanLovesBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int binary[] = new int[n];
        for (int i=0; i<n; i++){
            binary[i] = sc.nextInt();
        }
        binaryToDecimal(binary);
        for (int e : binary){
            System.out.println(e);
        }
    }

    public static void binaryToDecimal(int[] binary){
        for (int i=0; i<binary.length; i++){
            int num = binary[i];
            int sum=0;
            int mul=1;
            while (num>0){
                int rem = num%10;
                sum += rem*mul;
                mul*=2;
                num/=10;
            }
            binary[i]=sum;
        }
    }
}
