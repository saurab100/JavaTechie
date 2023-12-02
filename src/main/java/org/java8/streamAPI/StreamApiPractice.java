package org.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamApiPractice {

    public static void main(String[] args) {

        //1. Write a Java program to calculate the average of a list of integers using streams.
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().mapToDouble(i-> i).average().ifPresent(System.out::println);


    }
}
