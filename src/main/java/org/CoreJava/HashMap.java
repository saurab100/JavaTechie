package org.CoreJava;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class HashMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new java.util.HashMap();
        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        System.out.println(map);

        //How to display key value of a map using Entry Set
        for(Map.Entry x: map.entrySet()){
            System.out.println(x.getKey() +" " +x.getValue());
        }

        //Copy from map to another
        Map<Integer, String> map1 = new java.util.HashMap<>();
        map.putAll(map1);


        //
        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(4,"1");
        map2.put(5,"2");
        map2.put(6,"3");

       /* List<String> list = new ArrayList<>();
        list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(list);*/

        /*for(int i =0; i< s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);*/

    }
}
