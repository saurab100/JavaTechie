package org.leetcode;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int maxSum = 0;
        int total = 0;
        for(int i = 1; i <= nums.length; i++ ){
            maxSum += i;
        }
        for(int i = 0; i <= nums.length-1; i++ ){
            total += nums[i];
        }
        return (maxSum - total);
    }
}
