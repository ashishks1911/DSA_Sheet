package org.codingblocks.recursion;

/**
 * Understand PMI basics
 */
public class Test {
    public static void main(String[] args) {

//        System.out.println(pow(3, 4));
//        print_dec(5);

//        print_inc(5);
//        int arr[] = {2, 3, 4, 5, 6, 4, 5, 4, 5, 4};
//        int item=4;
//        System.out.println(searchFirstOccurrence(arr,item,0));
//        System.out.println(fact(4,1));
        System.out.println(fibonacci(10));
    }


    public static int factorial(int n) {
        // head recursion
        if (n == 0)
            return 1;
        int fn = factorial(n - 1);
        return n * fn;
    }

    public static int pow(int a, int n) {    //a^n
        if (n == 0) {
            return 1;
        }
        int fn = pow(a, n - 1);
        System.out.println(a + "*" + fn);
        return a * fn;
    }

    public static void print_dec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print_dec(n - 1);

    }

    public static void print_inc(int n) {
        if (n == 0) {
            return;
        }
        print_inc(n - 1);
        System.out.println(n);

    }

    /**
     * Two types of recursion :
     * Tail recursion
     * Head recursion
     */
    public static int searchFirstOccurrence(int[] arr, int item, int i) {
        //tail recursion
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == item)
            return i;

        int fn = searchFirstOccurrence(arr, item, i + 1);
        return fn;
    }

    public static int fact(int n, int ans) {
        // tail recursion
        if (n == 0)
            return 1;
        int fn = fact(n - 1, ans * n);
        return n * fn;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fibonacci(n - 1);
        int f2 = fibonacci(n - 2);
        return f1 + f2;

    }
}
