package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class MinStack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        for (int i = 0; i <n ; i++) {
            input[i] = sc.next();
        }
        Stack stack = new Stack();
        for (int i = 0; i <n ; i++) {
            switch (input[i]){
                case "push" :   int val = sc.nextInt();
                                stack.push(val);
                                break;
                case "pop" :    stack.pop();
                                break;
                case "top" :    System.out.print(stack.top()+" ");
                                break;
                case "getMin" : System.out.print(stack.getMin()+" ");
                                break;
            }
        }




    }

    static class Stack {
        int[] arr;
        int top = -1;
        int[] mins;

        public Stack() {
            arr = new int[10];
            mins = new int[10];
        }

        public void push(int val) {
            if (top == arr.length - 1) {
                int[] arr2 = new int[2 * arr.length];
                for (int i = 0; i < arr.length; i++) {
                    arr2[i] = arr[i];
                }
                arr = arr2;

                int[] min2 = new int[2 * mins.length];
                for (int i = 0; i < mins.length; i++) {
                    min2[i] = mins[i];
                }
                mins = min2;

            }
            if (top == -1) {
                top++;
                mins[top] = val;
                arr[top] = val;
            } else {
                int minimum = mins[top];
                top++;
                mins[top] = minimum < val ? minimum : val;
                arr[top] = val;
            }
        }

        public void pop() {
            arr[top] = 0;
            mins[top] = 0;
            top--;
        }

        public int top() {
            return arr[top];
        }

        public int getMin() {
            return mins[top];
        }
    }
}
