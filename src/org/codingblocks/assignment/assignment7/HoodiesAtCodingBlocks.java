package org.codingblocks.assignment.assignment7;

import java.util.Scanner;

public class HoodiesAtCodingBlocks {
    static class Queue {
        protected int size;
        protected int front;
        protected int[] data;

        public Queue() {
            this.size = 0;
            this.front = 0;
            this.data = new int[5];
        }

        public Queue(int cap) {
            this.size = 0;
            this.front = 0;
            this.data = new int[cap];
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return (size == 0);
        }

        public void enqueue(int item) throws Exception {
            if (this.size() == this.data.length) {
                int[] oa = this.data;
                int[] na = new int[oa.length * 2];
                for (int i = 0; i < this.size(); i++) {
                    int idx = (i + front) % oa.length;
                    na[i] = oa[idx];
                }

                this.data = na;
                this.front = 0;
            }

            // if (this.size == this.data.length) {
            // throw new Exception("queue is full");
            // }

            this.data[(front + size) % this.data.length] = item;
            size++;

        }

        public int dequeue() throws Exception {
            if (this.size == 0) {
                throw new Exception("queue is empty");

            }

            int rv = this.data[front];
            front = (front + 1) % this.data.length;
            size--;

            return rv;

        }

        public int getFront() throws Exception {
            if (this.size == 0) {
                throw new Exception("queue is empty");
            }

            int rv = this.data[front];

            return rv;
        }

        public void display() {
            System.out.println();
            for (int i = 0; i < size; i++) {
                int idx = (i + front) % this.data.length;
                System.out.print(this.data[idx] + " ");
            }
            System.out.print("END");
        }

    }

    public static void hoodies(int q) throws Exception {

        // Write your Code here
        Queue[] courses = new Queue[5];
        for (int i = 1; i <= 4; i++) {
            courses[i] = new Queue();
        }

        Queue courseOrder = new Queue();
        boolean[] activeCourses = new boolean[5];

        while (q-- > 0) {
            String op = scn.next();
            if (op.equals("E")) {
                int course = scn.nextInt();
                int rollNo = scn.nextInt();
                courses[course].enqueue(rollNo);

                if (!activeCourses[course]) {
                    courseOrder.enqueue(course);
                    activeCourses[course] = true;
                }
            } else {
                int currentCourse = courseOrder.getFront();
                int frontStudent = courses[currentCourse].dequeue();
                System.out.println(currentCourse + " " + frontStudent);
                if (courses[currentCourse].isEmpty()) {
                    courseOrder.dequeue();
                    activeCourses[currentCourse] = false;
                }
            }
        }

    }

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int n = scn.nextInt();
        hoodies(n);
    }

}