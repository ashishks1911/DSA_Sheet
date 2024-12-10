package org.codingblocks.stack;
import java.util.Stack;

public class ConstructSmallestNumberFromDIString {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(smallestNumber(pattern));
    }

    public static String smallestNumber(String pattern) {
        int n = pattern.length();
        int count = 1;
        int[] ans = new int[n + 1];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i <= pattern.length(); i++) {
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                ans[i] = count;
                count++;
                while (!st.isEmpty()) {
                    int x = st.pop();
                    ans[x] = count;
                    count++;
                }
            } else {
                st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : ans){
            sb.append(i);
        }
        return sb.toString();
    }
}
