package org.java8.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaPractice {

    public static void main(String[] args) {

        //. Write a Java program to implement a lambda expression to find the sum of two integers.
        Student sum = (a, b) -> a + b;

        //3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
        List<String> list = Arrays.asList("saurabh", "saxena");
        list.replaceAll(a -> a.toUpperCase());
        for(String s: list){
            System.out.println(s);
        }
        List<String> list1 = Arrays.asList("Saurabh", "SAXENA");
        list1.replaceAll(a -> a.toLowerCase());
        for(String s: list1){
            System.out.println(s);
        }


        // ****************************************************//
        // Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        List newList = list2.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
        for(Object s: newList){
            System.out.println(s);
        }

        // ****************************************************//

        //5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
        List<String> list3 = Arrays.asList("q", "f","a","r","h");
        /*list3.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list3);*/
        for(String s: list3){
            System.out.println(s);
        }

        //Another way using collections sort
        Collections.sort(list3, ((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list3);

        //6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
        List<Integer> list4 = Arrays.asList(1,2,3,4,5);
        list4.stream().mapToInt(i -> i).average().ifPresent(avg -> System.out.println(avg));
    }
}