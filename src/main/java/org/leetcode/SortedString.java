package org.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedString {
    public static void main(String[] args) {
        String s = "Saurabh";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String stringBuilder = new String(ch);
        System.out.println(stringBuilder);

        //desc order
        String s2 = "Saurabh";
        char[] chars = s2.toCharArray();
        Arrays.sort(chars);
        String builder = new StringBuilder(new String(chars)).reverse().toString();
        System.out.println(builder);
    }
}
