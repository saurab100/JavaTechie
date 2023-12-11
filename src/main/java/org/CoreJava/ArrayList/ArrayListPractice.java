package org.CoreJava.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {

        //1. Write a Java program to insert an element into the array list at the first position.
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(0,3);
        System.out.println(list);

        //2. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println(list.get(1));

        //3. Write a Java program to update an array element by the given element.
        list.set(1,5);
        System.out.println(list);

        //4. Write a Java program to search for an element in an array list.
        for (Integer e : list){
            if(e == 3){
                System.out.println(e);
            }
        }

        //5. Write a Java program to sort a given array list.
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        //6. Write a Java program to reverse elements in an array list.
        Collections.reverse(list);

        //7. Write a Java program that swaps two elements in an array list.
        Collections.swap(list,0, 1);
        System.out.println(list);
    }
}
