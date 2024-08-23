package org.ashish.hashing;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
public class _8_FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(firstNonRepeatingCharacter(s));
//        System.out.println(hashingSolution(s));
//        System.out.println(usingStringMethod(s));
    }

    public static int firstNonRepeatingCharacter(String s){
        for (int i=0; i<s.length(); i++){
            boolean flag = false;
            for (int j=0; j<s.length(); j++){
                if (s.charAt(i)==s.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if (!flag){
                return i;
            }
        }
        return -1;
    }

    /*
        T.C = O(N)
        S.C = O(N)
     */
    public static int hashingSolution(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        for (int i=0; i<s.length(); i++){
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }

    public static int usingStringMethod(String s){
        for(int i=0; i<s.length(); i++){
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
