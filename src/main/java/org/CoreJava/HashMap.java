package org.CoreJava;

public class HashMap {

    public static void main(String[] args) {
        java.util.HashMap<Character, Integer> map = new java.util.HashMap<>();
        String s = "SaurabhSaxena";

       /* List<String> list = new ArrayList<>();
        list.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(list);*/

        for(int i =0; i< s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);

    }
}
