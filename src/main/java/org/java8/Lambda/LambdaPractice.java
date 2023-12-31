package org.java8.Lambda;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class LambdaPractice {

    public static void main(String[] args) {

        //1. Write a Java program to implement a lambda expression to find the sum of two integers.
        Student sum = (a, b) -> a + b;

        //2. Write a Java program to implement a lambda expression to check if a given string is empty
       /* Predicate predicate = i -> i.isEmpty();
        System.out.println("String 1 is empty: " + predicate.test("a"));*/

        //3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
        List<String> list = Arrays.asList("saurabh", "saxena");
        list.replaceAll(a -> a.toUpperCase());
        for (String s : list) {
            System.out.println(s);
        }
        List<String> list1 = Arrays.asList("Saurabh", "SAXENA");
        list1.replaceAll(a -> a.toLowerCase());
        for (String s : list1) {
            System.out.println(s);
        }


        // ****************************************************//
        // 4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        List newList = list2.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        for (Object s : newList) {
            System.out.println(s);
        }

        // ****************************************************//

        //5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
        List<String> list3 = Arrays.asList("q", "f", "a", "r", "h");
        /*list3.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list3);*/
        for (String s : list3) {
            System.out.println(s);
        }

        //Another way using collections sort
        Collections.sort(list3, ((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list3);

        //6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5);
        list4.stream().mapToInt(i -> i).average().ifPresent(avg -> System.out.println(avg));

        //7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
        List<Integer> list5 = Arrays.asList(1, 1, 3, 3, 3, 6, 7, 8, 6, 5, 5, 5, 7, 7);
        list5.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        //8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
        IntUnaryOperator f = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        int n = 4;
        long result = f.applyAsInt(n);
        System.out.println(result);

        //9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
        Predicate<Integer> isprime = p -> {
            for (int i = 2; i <= Math.sqrt(p); i++) {
                if (p % i == 0) {
                    return false;
                }
            }
            return true;
        };
        int p = 5;
        boolean primeResult = isprime.test(p);
        System.out.println(primeResult);

        //10. Write a Java program to implement a lambda expression to concatenate two strings.
        BiFunction<String, String, String> biFunction = (o1, o2) -> o1.concat(o2);
        String s1 = "Saurbah";
        String s2 = "SaXENA";
        System.out.println(biFunction.apply(s1, s2));

        //11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
        List<Integer> list6 = Arrays.asList(2, 10, 4, -1, 5);
        list6.stream().min((o1, o2) -> o1.compareTo(o2)).ifPresent(System.out::println);
        list6.stream().max((o1, o2) -> o1.compareTo(o2)).ifPresent(System.out::println);

        //12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
        List<Integer> list7 = Arrays.asList(2, 10, 4, 1, 5);
        int totalSum = list7.stream().reduce(0, (a, b) -> a + b);
        int totalProduct = list7.stream().reduce(1, (a, b) -> a * b);
        System.out.println(totalProduct + " and " + totalSum);

        //13. Write a Java program to implement a lambda expression to count words in a sentence.
        WordCounter wordCounter = i -> i.split(" ").length;
        int count = wordCounter.countWords("Java lambda expression");
        System.out.println(count);

        //14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.
        Predicate<String> isPalindrome = s -> {
            int i = 0;
            int j = s.length() - 1;
            while (i <= j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        };
        Boolean palindrome = isPalindrome.test("s");
        System.out.println("isPalindrome: " + palindrome);

        //15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
        List<Integer> sq = Arrays.asList(2, 10, 4, 1, 5);
        int sOdd = sq.stream().filter( i -> i % 2 != 0).mapToInt( i -> i*i).sum();
        int sEven = sq.stream().filter(i -> i % 2 == 0).mapToInt(i -> i*i).sum();
        System.out.println(sOdd+ ":"+ sEven);

        //16. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
        List<String> list9 = Arrays.asList("saurabh", "saxena", "shruti", "shivang", "anish");
        boolean isWord = list9.stream().anyMatch(s -> s.equalsIgnoreCase("dhruv"));
        System.out.println("specific word: " + isWord);

        //*17. Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
        List<String> list10 = Arrays.asList("saurabh", "saxena", "mom", "shivang", "anish");
        int small = list10.stream().mapToInt(String::length).min().orElse(0);
        int large = list10.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(small + " " + large);

        //18. Write a Java program to implement a lambda expression to check if a given number is a perfect square.

        //19. Write a Java program to implement a lambda expression to find the second largest and smallest element in an array

        //22. Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.
    }
}
