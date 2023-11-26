package org.CoreJava.Strings;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        String[] arr = {"Black", "Pink", "Orange", "Blue"};
        Arrays.sort(arr, (o1, o2) -> o2.compareTo(o1));
        for(String s: arr){
            System.out.println(s);
        }
    }
}
