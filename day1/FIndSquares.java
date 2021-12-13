package day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FIndSquares {

	/*
	 * Given sorted integer array in non-decreasing order, return the 
	 * array of the squares of each number sorted in non-decreasing order
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {2,3,4,4,5};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), 
				new int[] {4, 9, 16, 16, 25}));
	
	}

	@Test // edge
	public void example2() {
		int[] nums = {-7, -5, 1, 4, 7};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), 
				new int[] {1, 16, 25, 49, 49}));
		
	}

	@Test // negative
	public void example3() {
		int[] nums = {};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), 
				new int[] {}));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * Traverse through input array, one at a time (for loop)
	 * Square the value and store in the same element 
	 * Finally, sort the array !!
	 * Print or return !!
	 * 
	 */

	private int[] squareAndSort(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			nums[i] = nums[i] * nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}

	

}
