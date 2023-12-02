package org.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class StreamApiPractice {

    public static void main(String[] args) {

        //1. Write a Java program to calculate the average of a list of integers using streams.
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().mapToDouble(i-> i).average().ifPresent(System.out::println);

        //2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        List<String> list1 = Arrays.asList("saurabh","AAA","AsBc");
        list1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(list1);
        list1.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        //3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        int oddSum = list2.stream().filter( i -> i%2 != 0).mapToInt(i -> i).sum();
        int evenSum = list2.stream().filter( i -> i%2 == 0).mapToInt(i -> i).sum();
        System.out.println(oddSum+ " : " +evenSum);
    }
}
