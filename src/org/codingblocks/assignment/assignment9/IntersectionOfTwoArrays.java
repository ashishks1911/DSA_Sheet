package org.codingblocks.assignment.assignment9;

import java.util.*;

/***
 * Intersection of Two Arrays II
 *
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> ans = intersection(arr1, arr2);
        Collections.sort(ans);
        System.out.println(ans);

    }

    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
                map.put(arr2[i], map.get(arr2[i]) - 1);
                ll.add(arr2[i]);
            }
        }

        return ll;
    }
}
