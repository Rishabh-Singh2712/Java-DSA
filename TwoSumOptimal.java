package com.DSALearning;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimal {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // If no solution is found, return an empty array or throw exception
        return new int[]{};  
    }

    public static void main(String[] args) {
        TwoSumOptimal ts = new TwoSumOptimal();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 9);
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
