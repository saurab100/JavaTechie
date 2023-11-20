package org.leetcode;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // int j = 0;
        // for(int i = 0; i <= nums.length-1; i++ ){
        //     if(nums[i] != 0){
        //         int temp = nums[i];
        //         nums[i] = nums[j];
        //         nums[j] = temp;
        //         j++;
        //     }
        // }

        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i] = num;
                i++;
            }
        }
        while (i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}
