package org.CoreJava;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        for(int i : set){
            System.out.println(i);
        }
        System.out.println(set);

        //Convert a set into tree set
        Set<Integer> set1 = new TreeSet<>(set);
    }
}
