package org.java8.streamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// We can use filter for conditional check
public class FilterDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Saurabh");
        list.add("Shivang");
        list.add("Chinmay");
        list.add("Parteek");
        list.add("Bhattu");

        //Traditional Method
        for (String s: list){
            if (s.startsWith("S")){
                System.out.println(s);
            }
        }
        //using stream API Filter method to add conditions
        list.stream().filter((t) -> t.startsWith("P")).forEach(t -> System.out.println(t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Saurabh");
        map.put(2, "Reek");
        map.put(3, "Phunsi");
        map.put(4, "Bob");

        map.entrySet().stream().filter((key) -> key.getKey()%2 == 0).forEach(t -> System.out.println(t));
    }
}
