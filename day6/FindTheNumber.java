package day6;

import org.junit.Test;

public class FindTheNumber {
	
	@Test
	public void example1() {
		int[] nums = {2,4,11,17,22,27,31};
		int k = 4;
		boolean result = binarySearch(nums,k);
		System.out.println(result);
	}

	private  boolean linearSearch(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == k )return true;
		}
		return false;
	}

	/*
	 * 1) Two pointers: low (0 index) , high (n-1 index)
	 * 2) Find the mid point (low+high)/2
	 * 3) Check if the value expected = mid point value
	 * 4)	a) Matches exactly --> return true
	 * 		b) No : value is less than expected -> move low -> mid+1
	 * 			  : value is high than expected -> move high -> mid-1
	 * 
	 * Break Point: low crosses high !!
	 * 
	 */
	
	private boolean binarySearch(int[] nums, int k) {
		
		int low = 0, high = nums.length-1;
		while(low < high) {
			int mid = (low + high)/2;
			if(nums[mid] == k) return true;
			else if(nums[mid] < k) low = mid+1;
			else high = mid -1;
		}
		return false;
	}
	
	
	
	
	
	
	
}
