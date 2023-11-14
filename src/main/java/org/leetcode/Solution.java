package org.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = 9;
        int[] arr = new int[2];
        solution.twoSum(arr, i);
    }
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[2];

            for(int i = 0 ; i < nums.length; i++){
                if(map.containsKey(target-nums[i])){
                    arr[0] = map.get(target-nums[i]);
                    arr[1] = i;
                    return arr;
                }
                map.put(nums[i], i);
            }
            return arr;
        }

}
