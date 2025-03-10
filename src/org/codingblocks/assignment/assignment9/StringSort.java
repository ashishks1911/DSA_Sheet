package org.codingblocks.assignment.assignment9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            list.add(s);
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.startsWith(o2))
                    return o2.compareTo(o1);
                return o1.compareTo(o2);
            }
        });

        for(String val : list){
            System.out.println(val);
        }
    }
}
