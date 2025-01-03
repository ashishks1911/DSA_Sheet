package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

/**
 * https://hack.codingblocks.com/app/contests/6814
 * Assignment on Stack, Queue and Linked List
 */
public class BalancedParentheses {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        BalancedParentheses mainobj = new BalancedParentheses();
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
        if (isBalanced(str, stack)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isBalanced(String str, StacksUsingArrays stack) throws Exception {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push((int) ch);
            } else {
                if (!stack.isEmpty()) {
                    if (ch == '}' && (char) stack.top() != '{')
                        return false;
                    else if (ch == ']' && (char) stack.top() != '[')
                        return false;
                    else if (ch == ')' && (char) stack.top() != '(') {
                        return false;
                    }
                } else {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private class StacksUsingArrays {
        private int[] data;
        private int tos;

        public static final int DEFAULT_CAPACITY = 10;

        public StacksUsingArrays() throws Exception {
            // TODO Auto-generated constructor stub
            this(DEFAULT_CAPACITY);
        }

        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.data = new int[capacity];
            this.tos = -1;
        }

        public int size() {
            return this.tos + 1;
        }

        public boolean isEmpty() {
            if (this.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void push(int item) throws Exception {
            if (this.size() == this.data.length) {
                throw new Exception("Stack is Full");
            }
            this.tos++;
            this.data[this.tos] = item;
        }

        public int pop() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return retVal;
        }

        public int top() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            return retVal;
        }

        public void display() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.tos; i >= 0; i--) {
                System.out.println(this.data[i]);
            }

        }

    }
}

