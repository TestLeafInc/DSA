package day1;

import org.junit.Test;

import org.junit.*;

public class SingleNumber {

	/*
	 * Given a non-empty array of integers nums, 
	 * every element appears twice except for one. 
	 * Find that single one.
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {2,2,1};
		Assert.assertEquals(1, findSingleNumber(nums));
	}

	
	@Test // edge
	public void example2() {
		int[] nums = {1};
		Assert.assertEquals(1, findSingleNumber(nums));
	}

	@Test // negative
	public void example3() {
		int[] nums = {4,1,2,1,2};
		Assert.assertEquals(4, findSingleNumber(nums));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 1) Sort the given input  // 1,2,2
	 * 2) Compare the next element 
	 * 		a) If it is same, move your index to the next element + 1
	 * 		b) If it is different, return that element
	 * 		c) If it is the last element, return that element
	 * 
	 */
	private int findSingleNumber(int[] nums) {
		return 0;
	}


}
