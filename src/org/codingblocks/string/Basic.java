package org.codingblocks.string;

/**
 * primitive datatype occupies stack memory
 * non-primitive datatype occupies heap memory
 *
 */
public class Basic{
    public static void main(String[] args) {
        String s1 = "Hello";      //String pool
        String s2 = "Hello";        //String pool
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = "Hey"+"Bye";        //String pool
        System.out.println(s2);
        String s = "codingblocks";
        System.out.println(s.substring(2,6));   // 2nd to 5th
        // index
        System.out.println(s.substring(3));     //3rd index to end


        //--------------------------------
        String str1 = "Kunal";
        String str2 = "Komal";
        System.out.println(str1.compareTo(str2));      //char diff
        String str3 = "punam";
        String str4 = "puneet";
        System.out.println(str3.compareTo(str4));   //char diff
        String str6 = "Ankita";
        String str7 = "Ankit";
        System.out.println(str6.compareTo(str7));   //len diff

    }
    public static boolean equals(String str1, String str2){
        if (str1==str2)
            return true;
        if (str1.length()!=str2.length())
            return false;
        for (int i=0; i<str1.length(); i++){
            if (str1.charAt(i)!=str2.charAt(i))
                return false;
        }
        return true;
    }

    public static int compareTo(String s1, String s2){
        if (s1==s2)
            return 0;
        int len = Math.min(s1.length(),s2.length());
        for (int i=0; i<len; i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                return s1.charAt(i)-s2.charAt(i);   //+ve s1>s2 || -ve s1<s2
            }
        }
        return s1.length()-s2.length();     //+ve s1>s2 || -ve s1<s2
    }

}
