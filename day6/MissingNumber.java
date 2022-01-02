package day6;

import org.junit.Test;

public class MissingNumber {
	
	@Test
	public void example1() {
		int[] nums = {2,3,4,7,11};
		int k = 5;
		int result = findKthPositive(nums,k);
		System.out.println(result);
	}
	
	@Test
	public void example2() {
		int[] nums = {1,2,3,4};
		int k = 3;
		int result = findKthPositive(nums,k);
		System.out.println(result);
	}
	
	@Test
	public void example3() {
		int[] nums = {1,3,5};
		int k = 1;
		int result = findKthPositive(nums,k);
		System.out.println(result);
	}

	public int findKthPositive(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] - mid > k) high = mid-1;
            else low = mid + 1;
        }
        return low + k;
    }
	
	
	
	
	
	
}
