package org.CoreJava.Strings;

import java.util.HashMap;
import java.util.Map;

public class RemoveString {
    public static void main(String[] args) {
        String a = "Saurabh";
        String b = "Chinmay";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if(map.containsKey(a.charAt(i))){
                map.put(a.charAt(i), map.get(a.charAt(i))+1);
            }
            else{
                map.put(a.charAt(i), 1);
            }
        }
        System.out.println(map);
        for(int i = 0; i< b.length(); i++){
            if(map.containsKey(b.charAt(i))) {
                while (map.containsKey(b.charAt(i))) {
                    map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
                    if (map.get(b.charAt(i)) == 0) {
                        map.remove(b.charAt(i));
                    }
                }
            }
        }
        System.out.println(map);
    }
}
