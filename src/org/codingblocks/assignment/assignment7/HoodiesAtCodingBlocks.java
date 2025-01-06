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
        Queue q1 = new Queue();
        Queue q2 = new Queue();
        Queue q3 = new Queue();
        Queue q4 = new Queue();

        Queue seq = new Queue();
        boolean isOne = false, isTwo = false, isThree = false, isFour = false;

        while (q-- > 0) {
            String op = scn.next();
            if (op.equals("E")) {
                int course = scn.nextInt();
                int rollNo = scn.nextInt();
                switch (course) {
                    case 1:
                        q1.enqueue(rollNo);
                        if (!isOne) {
                            seq.enqueue(1);
                            isOne = true;
                        }
                        break;
                    case 2:
                        q2.enqueue(rollNo);
                        if (!isTwo) {
                            seq.enqueue(2);
                            isTwo = true;
                        }
                        break;
                    case 3:
                        q3.enqueue(rollNo);
                        if (!isThree) {
                            seq.enqueue(3);
                            isThree = true;
                        }
                        break;
                    case 4:
                        q4.enqueue(rollNo);
                        if (!isFour) {
                            seq.enqueue(4);
                            isFour = true;
                        }
                        break;
                }

            } else {
                int rmq = seq.getFront();
                if (rmq == 1) {
                    System.out.println(rmq + " " + q1.dequeue());
                    if (q1.isEmpty()) {
                        seq.dequeue();
                    }
                } else if (rmq == 2) {
                    System.out.println(rmq + " " + q2.dequeue());
                    if (q2.isEmpty()) {
                        seq.dequeue();
                    }
                } else if (rmq == 3) {
                    System.out.println(rmq + " " + q3.dequeue());
                    if (q3.isEmpty()) {
                        seq.dequeue();
                    }
                } else {
                    System.out.println(rmq + " " + q4.dequeue());
                    if (q4.isEmpty()) {
                        seq.dequeue();
                    }
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