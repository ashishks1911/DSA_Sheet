package org.codingblocks.assignment.assignment2;

import java.util.Scanner;

/****
 *
 * Formula :
 *      C = (5/9) (F-32)
 *
 * Input Format:
 * Minimum Fahrenheit value (min)
 * Maximum Fahrenheit value (max)
 * step
 *
 * Constraints:
 * 0<min<100
 * min<max<100
 * 0<step<150
 *
 *
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();

        while(min<=max){
            int celsius = ((min-32)*5)/9;
            System.out.println(min+" "+celsius);
            min += step;
        }
    }
}
