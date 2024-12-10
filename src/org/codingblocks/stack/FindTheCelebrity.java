package org.codingblocks.stack;

import java.util.Stack;

public class FindTheCelebrity {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 0}, {0, 0, 0}, {0, 1, 0}};
        System.out.println(findTheCelebrity(mat));
    }

    /**
     * Brute force approach
     *
     * @param mat
     * @return
     */
    public static int findTheCelebrity(int[][] mat) {
        int ans = -1;
        for (int i = 0; i < mat.length; i++) {
            boolean celebrity = true;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0)
                    celebrity = false;
            }
            if (celebrity) {
                for (int k = 0; k < mat.length; k++) {
                    if (mat[k][i] != 1 && k != i)
                        celebrity = false;
                }
            }
            if (celebrity) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static int celebrity(int[][] mat) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < mat.length) {
            st.push(i);
            i++;
        }

        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (mat[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int candidate = st.pop();
        for (int k = 0; k < mat.length; k++) {
            if (candidate == k)
                continue;
            if (mat[candidate][k] == 1 || mat[k][candidate] == 0) {
                return -1;
            }
        }
        return candidate;

    }
}
