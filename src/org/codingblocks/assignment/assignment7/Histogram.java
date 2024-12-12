package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        Histogram mainobj = new Histogram();
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
        System.out.println(hist(arr, stack));
    }

    public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {
        //Write Your Code here
        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.top()]) {
                int h = arr[stack.pop()];
                int r = i;
                if (!stack.isEmpty()) {
                    int l = stack.top();
                    area = Math.max(area, h * (r - l - 1));
                } else {
                    area = Math.max(area, h * r);
                }
            }
            stack.push(i);
        }
        int r = arr.length;
        while (!stack.isEmpty()) {
            int h = arr[stack.pop()];
            if (!stack.isEmpty()) {
                int l = stack.top();
                area = Math.max(area, h * (r - l - 1));
            } else {
                area = Math.max(area, h * r);
            }
        }
        return area;

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


