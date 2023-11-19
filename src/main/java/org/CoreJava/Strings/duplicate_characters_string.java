package org.CoreJava.Strings;

import java.util.HashMap;
import java.util.Map;

public class duplicate_characters_string {
    public static void main(String[] args){
        String s = "Saurabh Saxena";
        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i <= s.length()-1; i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
                System.out.println(s.charAt(i));
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
    }
}
