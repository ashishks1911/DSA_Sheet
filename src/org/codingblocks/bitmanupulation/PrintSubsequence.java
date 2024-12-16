package org.codingblocks.bitmanupulation;

public class PrintSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        print(str);
    }
    public static void print(String str){
        int n = str.length();
        for (int i=0; i<(1<<n); i++){
            pattern(str, i);
        }
    }

    private static void pattern(String str, int i) {
        int pos =0 ;
        while (i>0){
            if ((i&1)!=0){
                System.out.print(str.charAt(pos));
            }
            i = i >> 1;
            pos++;
        }
        System.out.println();
    }
}
