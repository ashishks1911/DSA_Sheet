package org.codingblocks.assignment.assignment7;
import java.util.Scanner;
import java.util.Stack;

public class DequeueEfficientQueueUsingStack {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue q = new Queue();
        for (int i = 0; i < n; i++) {
            q.enQueue(i);
        }
        while (!q.isEmpty()) {
            System.out.print(q.deQueue() + " ");
        }

    }

    static class Queue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        public boolean isEmpty() {
            return stack1.isEmpty();
        }
        public void enQueue(int item) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(item);
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        public int deQueue() {
            return stack1.pop();
        }
    }
}
