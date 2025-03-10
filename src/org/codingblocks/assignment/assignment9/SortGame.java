package org.codingblocks.assignment.assignment9;

import java.util.*;
import java.util.stream.*;

public class SortGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        //Don't use hashMap to store {name, salary} as 2 employees can have same name.
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int salary = sc.nextInt();
            list.add(new Employee(name, salary));
        }

        List<Employee> ans = list.stream().filter(emp -> emp.salary >= x).sorted((e1, e2) -> {
            if (e1.salary != e2.salary)
                return e2.salary - e1.salary;
            else
                return e1.name.compareTo(e2.name);
        }).collect(Collectors.toList());

        for (Employee emp : ans) {
            System.out.println(emp.name + " " + emp.salary);
        }

    }

    static class Employee {
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }
}
