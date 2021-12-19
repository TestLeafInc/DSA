package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElement {
	
	@Test // positive
	public void example1() {
		int[] nums = {5,3,2,1,2,3};
		int target =  3;
		int[] out =  removeElement(nums, target);
		Assert.assertTrue(Arrays.equals(out, new int[] {5,2,1,2}));
	}
	
	@Test // negative
	public void example3() {
		int[] nums = {};
		int target =  3;
		int[] out =  removeElement(nums, target);
		Assert.assertTrue(Arrays.equals(out, new int[] {}));
	}
	
	// Single pass
	// Time Complexity : O(n)
	// Space Complexity : You need measure --> new memory !!
	// O(1) + O(1) + O(n) --> O(n)
	
	private int[] removeElement(int[] nums, int k) {
		int left = 0;
		for (int right = 0; right < nums.length; right++)
			if(nums[right] != k) nums[left++] = nums[right];
		return Arrays.copyOf(nums, left);
	}

	/*
	 * Time Complexity --> Execution iterations / time  --> CPU  !!
	 * Space Complexity --> Number of variables / data created --> Memory
	 * 
	 */
}
