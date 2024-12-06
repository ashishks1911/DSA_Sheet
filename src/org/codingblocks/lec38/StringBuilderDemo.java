package org.codingblocks.lec38;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();     //default capacity 16;
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder("coding");    //capacity 16+6 = 22
        System.out.println(sb2.capacity());

        sb.append("jbfdxfgchvjbknl");
        sb.append('a');
        sb.append(true);
        sb.append(1011);
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.hashCode());
        System.out.println(sb.charAt(2));
        System.out.println(sb.substring(1,3));
        System.out.println(sb.substring(1));
        System.out.println(sb.reverse());

        String s = sb.toString();
        StringBuilder sb3 = new StringBuilder(s);

    }
}
