package org.codingblocks.string;

import java.util.Arrays;

/**
 *
 * 151. Reverse words in a string
 */
public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good     example     ";
        System.out.println(s);
        s = s.trim();   //removes leading and ending spaces...
        System.out.println(s);
        String []arr = s.split(" +");    // " +" or "\s+" removes all space and split
                                                // "," splits on the basis of ,
                                                // "!" splits on the basis of !
                                                // "!+" splits for multiple !
//        System.out.println(Arrays.toString(arr));

        System.out.println(solution(s));
    }
    public static String solution(String s){
        s.trim();
//        System.out.println(s);
        String[] arr = s.split(" +");
        String ans= "";
        for (int i=arr.length-1; i>=0; i--){
            ans = ans+arr[i]+" ";
        }
        return ans.trim();
    }

}
