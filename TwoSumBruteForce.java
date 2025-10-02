/*Problem Statement:
Two Sum
You are given an array of integers nums and an integer target.

Your task is to find two numbers in the array whose sum equals the target.

Return their indices.

Example:

Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1] 
Explanation: nums[0] + nums[1] = 2 + 7 = 9*/


package com.DSALearning;

public class TwoSumBruteForce {
     public int[] twoSum(int [] nums, int target)
     {
    	 
    	 for (int i=0; i<nums.length;i++)
    	 {
    		 for(int j=i+1; j<nums.length;j++)
    		 {
    			 if(nums[i]+nums[j]==target)
    			 {
    				 return new int[] {i,j};
    			 }
    		 }
    	 }
    	 return new int[] {};
     }
     public static void main(String[] args) {
		TwoSumBruteForce ts= new TwoSumBruteForce();
		int[] result =ts.twoSum(new int [] {2,7,11,15},9);
		System.out.println("Indices:"+result[0]+","+result[1]);
	}
}
