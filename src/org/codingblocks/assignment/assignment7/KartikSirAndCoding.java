package org.codingblocks.assignment.assignment7;

import java.util.Scanner;
import java.util.Stack;

public class KartikSirAndCoding {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int q = s.nextInt();
        Stack<Integer> st = new Stack<>();
        print(st, q);
    }
    public static void print(Stack<Integer> stack, int q){
        while(q-->0){
            int type = s.nextInt();
            switch (type){
                case 1 :
                    if(!stack.isEmpty())
                        System.out.println(stack.pop());
                    else
                        System.out.println("No Code");
                    break;
                case 2 :
                    int cost = s.nextInt();
                    stack.push(cost);
                    break;
            }
        }
    }
}
