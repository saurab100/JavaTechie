package org.java8.streamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

// Similar to a for loop but using Streams improves the performance

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Saurabh");
        list.add("Shivang");
        list.add("Chinmay");
        list.add("Parteek");
        list.add("Bhattu");

        //Traditional Method
        for (String s: list){
            System.out.println(s);
        }

        //using Stream API
        list.stream().forEach((t) -> System.out.println(t));

        Map<String, String> map = new HashMap<>();
        map.put("1", "Saurabh");
        map.put("2", "Reek");
        map.put("3", "Phunsi");
        map.put("4", "Bob");


        map.forEach((key, val) -> System.out.println(key+':'+val));
        map.entrySet().forEach(obj -> System.out.println(obj));
    }
}
