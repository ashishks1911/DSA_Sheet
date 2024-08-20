package org.codingblocks.string;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        //create
        ArrayList<Integer> li = new ArrayList<>();
        //size
        System.out.println(li.size());
        System.out.println(li);
        //add
        li.add(10);
        li.add(5);
        li.add(20);
        System.out.println(li);
        li.add(3,9);    //index range 0 to size
        System.out.println(li);

        //get
        System.out.println(li.get(2));     // index range 0 to size - 1
        //remove
        System.out.println(li.remove(1));

        System.out.println(li);
        //update
        li.set(1,-11);
        System.out.println(li);


    }
    public static void display(ArrayList<Integer> li){
        for (int i=0; i<li.size(); i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println();

    }
}