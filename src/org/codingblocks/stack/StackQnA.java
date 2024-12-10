package org.codingblocks.stack;

import java.util.Stack;

public class StackQnA {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        insertAtBottom(st, -6);
        System.out.println(st);
        System.out.println("----------------");
        reverse(st);
        System.out.println(st);
    }

    /**
     * Insert the given element at the bottom of the stack
     * @param st
     * @param item
     */
    public static void insertAtBottom(Stack<Integer> st, int item){
        if (st.isEmpty()){
            st.push(item);
            return;
        }
        int x = st.pop();
        insertAtBottom(st, item);
        st.push(x);
    }

    /**
     * Reverse the stack elements
     * @param st
     */
    public static void reverse(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }
        int x = st.pop();
        reverse(st);
        insertAtBottom(st, x);
    }
}
