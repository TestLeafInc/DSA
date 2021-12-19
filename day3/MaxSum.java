package day3;

import org.junit.Test;

public class MaxSum {
	
	@Test
	public void example1() {
		int[] nums = {1,5,2,3,7,1};
		int k = 3;
		findMaxSum(nums, k);
	}
	
	@Test
	public void example2() {
		int[] nums = {8,4,2,3,11,15,2,1};
		int k = 2;
		findMaxSum(nums, k);
	}
	
	/*
	1) Add first k elements and have a sum
	2) loop from k element until end 
	    a) subtract the first element from the sum
	    b) add the new element to the sum
	    c) compare with existing sum --> whichever max --> make it max
    */

	private void findMaxSum(int[] nums, int k) {
		int maxSum = 0, windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum += nums[i];
		}
		maxSum = windowSum;
		for (int i = k; i < nums.length; i++) {
			windowSum -= nums[i-k] + nums[i];
			maxSum = Math.max(maxSum, windowSum);
		}
		System.out.println(maxSum);
	}
	
	
	

}
