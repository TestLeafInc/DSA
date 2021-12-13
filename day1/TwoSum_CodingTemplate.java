package day1;

import org.junit.Test;

public class TwoSum_CodingTemplate {

	/*
	 * Given the input int array, find the sum of any two distinct indices of the matching 
	 * given the target 
	 * 
	 */

	//@Test // +ve
	public void example1() {
		int[] nums = {2,7,11,15};
		int target = 9;
		twoSum_BruteForce(nums, target);
		// Output --> {0,1}
	}

	//@Test // edge
	public void example2() {
		
		int[] nums = {2,2,3,1,4,0,5};
		int target = 5;
		twoSum_BruteForce(nums, target);
		//Output --> {{0,2},{1,2},{3,4},{5,6}}

	}

	@Test // negative
	public void example3() {
		int[] nums = {2,2,3,1,4,0,5};
		int target = 45;
		twoSum_BruteForce(nums, target);

		//output => throw saying no match
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 1) Take the input array 
	 * 2) Traverse every element using for loop
	 * 3) Add with the next element with the outer loop
	 * 4) Compare the sum with the target
	 * 		a) If it matches, store them in a list !!
	 * 		b) If it does not match, continue
	 * 5) Finally, return the list !! 
	 * 
	 */

	private void twoSum_BruteForce(int[] nums, int target) {
		boolean bMatch = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					System.out.println(i+","+j);
					bMatch = true;
				}
			}
		}
		
		if(!bMatch)
			throw new RuntimeException("There is no match");
	}

	private void twoSum_TwoPointer() {

	}

}
