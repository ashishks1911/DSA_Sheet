package org.codingblocks.recursion.lec17;

public class Permutation2 {
    public static void main(String[] args) {
        String ques = "abca";
        String ans = "";
        permutation(ques,ans);
    }
    public static void permutation(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            if (!isPresent(ques,ch,i+1)) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);
                permutation(s1 + s2, ans + ch);
            }
        }
    }
    public static boolean isPresent(String s, char ch, int i){
        while (i<s.length()){
            if (s.charAt(i)==ch){
                return true;
            }
            i++;
        }
        return false;
    }
}
