package org.java8.streamAPI;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        //Traditional Method
        /*Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
    }*/
        //Using Lambdas
        Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
        System.out.println("*********");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Using Stream API
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    }
}
