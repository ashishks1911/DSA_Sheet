package org.codingblocks.assignment.assignment6;

import java.util.Scanner;

public class ReplaceAllPi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(replacePi(arr[i]));
        }

    }

    public static String replacePi(String str) {
        if (str.length() == 0 || str.length() == 1)
            return str;
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i') {
            return "3.14" + replacePi(str.substring(2));
        }
        return str.charAt(0) + replacePi(str.substring(1));
    }

}
