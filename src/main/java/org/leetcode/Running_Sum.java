package org.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Running_Sum {
        public int[] runningSum(int[] nums) {
            int[] arr = new int[nums.length];
            arr[0] = nums[0];
            for(int i =1; i<= nums.length-1; i++){
                arr[i] = arr[i-1] + nums[i];
            }
            return arr;
        }

    public static void main(String[] args) {
        String s = "my name is saurabh saxena and saurabh is a very my name and he is very good";
        String[] words = s.split(" ");
        List<String> list = Arrays.asList(words);
        list.stream().filter(s1 -> s1.length() > 3)
                .distinct()
                .forEach(System.out::println);
    }
    }
