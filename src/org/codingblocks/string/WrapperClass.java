package org.codingblocks.string;

public class WrapperClass {
    public static void main(String[] args) {
        int x = 90;
        Integer x1 = 9;
        System.out.println(x);
        System.out.println(x1);
        Long l = 78l;
        Character ch = 'a';
        x1 = x;   //auto boxing
        int a = 89;
        Integer a1 = 7869;
        a = a1; //unboxing
        Integer[] ar = new Integer[6];
        int[] arr = new int[6];
        ar[0] = 8;     //auto boxing : putting primitive data in non-primitive and
        // reverse is unboxing.
        arr[0] = 9;

        Integer p1 = 78;
        Integer p2 = 78;
        Integer p3 = 178;       //Integer cache range = -128 to 127
        Integer p4 = 178;
        System.out.println(p1==p2);
        System.out.println(p3==p4);


    }
}
