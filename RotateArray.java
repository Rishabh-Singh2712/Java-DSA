/*Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 step to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]*/
package com.DSALearning;

import java.util.Arrays;

public class RotateArray {
	public void rotate(int[] nums, int k)
	{
		int len=nums.length;
		k=k%len;
		reverse(nums,0,len-1);
		reverse(nums,0,k-1);
		reverse(nums,k,len-1);
	}
	private void reverse(int [] nums, int left, int right) {
		while(left<right)
		{
			int temp=nums[left];
			nums [left]=nums[right];
			nums[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		RotateArray RA =new RotateArray();
		RA.rotate(nums, k);
		System.out.println(Arrays.toString(nums));
	}

}
