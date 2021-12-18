package day2;

import org.junit.Test;

public class TwoSum {

	/*
	 * Given the input int array, find the sum of any two distinct indices of the matching 
	 * given the target 
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {2,7,11,15};
		int target = 9;
		twoSum_TwoPointer(nums, target);
	}

	@Test // edge
	public void example2() {
		
		int[] nums = {1,2,2,3,4,6,7};
		int target = 5;
		twoSum_TwoPointer(nums, target);

	}

	@Test // negative
	public void example3() {
		int[] nums = {1,2,2,4,6,8};
		int target = 100;
		twoSum_TwoPointer(nums, target);

	}

	/*
	 * Two Pointer Algo
	 * 
	 * 1) Left -> 0 index , Right --> last index
	 * 2) Loop through until left is smaller than right index
	 * 		a) Sum both left index value with right index 
	 * 			1) sum = k --> you got it !! --> return left, right
	 * 			2) sum < k --> increment left
	 * 			3) sum > k --> decrement right
	 * 
	 * Note: Solution works only when numbers are sorted !!
	 * 
	 */

	private void twoSum_TwoPointer(int[] nums, int k) {
		int left = 0, right = nums.length-1;
		boolean bFound = false;
		
		while(left < right) {
			int sum = nums[left] + nums[right];
			if(sum == k) {
				System.out.println(left + ","+right);
				bFound = true;
				break;
			}else if(sum < k) left++;
			else right--;
		}
		
		if(!bFound)
			throw new RuntimeException("No matches found");
		
	}

}
