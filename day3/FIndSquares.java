package day3;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class FIndSquares {

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
	 * Time Complexity : O(n/2) --> Best case // O(n) --> Worst case
	 * Space Complexity : O(n)
	 * 
	 */
	private int[] squareAndSort(int[] nums) {
		int[] squared = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int insertIndex = nums.length - 1;
        
        while (left <= right) {
            if (Math.abs(nums[left]) < Math.abs(nums[right]))
                squared[insertIndex--] = nums[right] * nums[right--];
            else
                squared[insertIndex--] = nums[left] * nums[left++];
        }
        return squared;
	}
	
	
	
	
	
	
	
	
	

	

}
