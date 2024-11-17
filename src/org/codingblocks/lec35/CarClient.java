package org.codingblocks.lec35;

import java.util.Arrays;
import java.util.Comparator;

public class CarClient {
    public static void main(String[] args) {
        Car[] arr = new Car[5];
        arr[0] = new Car(200, 10, "white");
        arr[1] = new Car(1000, 20, "black");
        arr[2] = new Car(345, 3, "yellow");
        arr[3] = new Car(34, 89, "Grey");
        arr[4] = new Car(8907, 6, "red");
        Arrays.sort(arr, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.price - o2.price;
            }
        });
        Arrays.sort(arr, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.speed - o2.speed;
            }
        });
        Arrays.sort(arr, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.color.compareTo(o2.color);
            }
        });

//        bubbleSort(arr);
        display(arr);
    }


    public static <T> void display(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static <T extends Comparable<T>> /*set bound*/ void bubbleSort(T[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                //if (arr[i] > arr[i + 1]) {      // comparison of addresses gives error
                if (arr[i].compareTo(arr[i + 1])>0) {
                    T temp = arr[i];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

}
