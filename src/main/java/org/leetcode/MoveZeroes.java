package org.leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        String first = "";
        String sec;
        for(int i = 0; i <= nums.length - 1; i = i+2){
            first += String.valueOf(nums[i]);
        }
        System.out.println(first);

}
}
