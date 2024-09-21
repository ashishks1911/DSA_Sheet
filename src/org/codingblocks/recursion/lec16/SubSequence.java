package org.codingblocks.recursion.lec16;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abc";
//        subSequence(str,"");
        System.out.println(countSequence(str,""));
    }
    public static void subSequence(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        subSequence(ques.substring(1), ans+"");
        subSequence(ques.substring(1), ans+ch);
    }

    //another way to count is using a static field
    public static int countSequence(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        char ch = ques.charAt(0);
        int a1 = countSequence(ques.substring(1), ans + "");
        int a2 = countSequence(ques.substring(1), ans + ch);
        return a1 + a2;
    }
}
