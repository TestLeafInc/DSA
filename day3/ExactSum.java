package day3;

import org.junit.Test;

public class ExactSum {
	
	@Test
	public void example1() {
		int[] nums = {1,7,4,3,1,2,1,5,1};
		int k = 7;
		findExactSumIndicies(nums, k);
	}
	
	/*
	Start with first element 
	If the sum is less than the desired sum, slide to the next element [Grow]
	Again, sum that and check if it is lesser, equal or greater
	If it is lesser, add the next element to slide [Grow]
	If it is greater, than shrink the last element on the left [Shrink]
	If it is equal, you got it and again do both Grow and Shrink [Slide]
	*/

	// O(n) 
	// O(1)
	private void findExactSumIndicies(int[] nums, int k) {
		int left = 0, sum = 0;
		for (int right = 0; right < nums.length;right++) {
			sum += nums[right]; // grow
			while(sum > k) { // shrink
				sum -= nums[left++];
			}
			if(sum == k) { // match 
				System.out.println(left + ","+ right);
			}
		}
		
	}
	

}
