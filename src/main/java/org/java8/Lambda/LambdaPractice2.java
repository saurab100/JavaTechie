package org.java8.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class LambdaPractice2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","D","E");
        List<String> result = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(result);


        List<Integer> list1 = Arrays.asList(1,2,3,45,6,7,8);
        List<Integer> odd = list1.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
        System.out.println(odd);

        List<String> list2 = Arrays.asList("d","b","e","a","b");
        List<String> result2 = list2.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(result2);

        List<Double> list3 = Arrays.asList(1.5,2.5,3.5,45.5,6.5,7.5,8.5);
        list3.stream().mapToDouble(i -> i).average().ifPresent(System.out::println);

        List<Integer> list4 = Arrays.asList(1,2,3,45,6,7,8,2,1,6);
        List<Integer> result3  = list4.stream().distinct().collect(Collectors.toList());
        System.out.println(result3);


        IntUnaryOperator f = n -> {
            int res = 1;
            for(int i = 1; i <= n; i++){
            res = res*i;
        }
            return res;
        };
        int n = 4;
        long fe = f.applyAsInt(n);
        System.out.println(fe);

        List<Integer> list5 = Arrays.asList(2, 10, 4, 1, 5);
        int max = list5.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        int min = list5.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(max+ ":"+ min);

        List<Integer> list6 = Arrays.asList(2, 10, 4, 1, 5);
        int sum = list6.stream().reduce(0, (a, b) -> a+b);
        int prod = list6.stream().reduce(1, (a, b) -> a*b);
        System.out.println(sum+ ":"+ prod);




    }
}
