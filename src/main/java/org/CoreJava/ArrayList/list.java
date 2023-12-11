package org.CoreJava.ArrayList;

import java.util.*;
import java.util.stream.Collectors;

public class list {
    public static void main(String[] args) {

        /*List<Integer> list = new ArrayList<>(Arrays.asList(-1, 2, 6,4,7,11, 5, 9, 0, 23));
        int max = list.get(0); int min = list.get(0);
        //Naive
        for(Integer e : list){
            if (e > max){
                max = e;
            }
        }
        for(Integer e : list){
            if (e < min){
                min = e;
            }
        }
        max = Collections.max(list);
        min = Collections.min(list);
        System.out.println(max+" ,"+min);*/

        //2. Remove Duplicates from ArrayList in Java

        /*List<Integer> list = new ArrayList<Integer>(){{add(2);add(1);add(3);add(7);add(5);add(1);add(1);}};
        List<Integer> list1 = new ArrayList<>();
        for(Integer i : list){
            if (!list1.contains(i)){
                list1.add(i);
            }
        }
        Using Hashset
        Set<Integer> list1 = new LinkedHashSet<>();
        for(Integer i : list){
            list1.add(i);
        }
        using java 8
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);*/

        //3. sort an ArrayList in Ascending Order
        /*List<Integer> list = new ArrayList<>(Arrays.asList(1,7,3,5,8,2,1,4));

        Collections.sort(list, (o1,o2) -> o2.compareTo(o1));
        list.stream().sorted((o1,o2) -> o2.compareTo(o1)).collect(Collectors.toList()).forEach(System.out::println);*/

        //4. Convert a List of String to a comma separated String in Java

        List<Integer> list = new ArrayList<>(Arrays.asList(2,4,5,6));
        list.removeAll(list);
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3,6,7,8));
        for(int e: list1){
            list.add(e);
        }
        System.out.println(list);
    }
}
