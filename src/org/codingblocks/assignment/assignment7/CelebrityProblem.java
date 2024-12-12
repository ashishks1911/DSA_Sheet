package org.codingblocks.assignment.assignment7;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 1, 0}
        };
        celebrity(arr);
    }

    public static void celebrity(int[][] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int x = st.pop();
            int y = st.pop();
            if (arr[x][y] == 1) {
                st.push(y);
            } else {
                st.push(x);
            }
        }
        int candidate = st.pop();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (candidate == i) {
                continue;
            }
            if (arr[candidate][i] == 1 || arr[i][candidate] == 0) {
                System.out.println("No Celebrity");
                found = true;
            }
        }
        if(!found)
            System.out.println(candidate);
    }
}