package org.leetcode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount = 0;
        for(int i = 0; i <= nums.length-1; i++){
            if(nums[i] == 1){
                currCount++;
                maxCount = Math.max(maxCount, currCount);
            }
            else{
                currCount = 0;
            }
        }
        return maxCount;
    }
}
