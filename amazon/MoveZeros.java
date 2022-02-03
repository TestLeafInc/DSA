package amazon;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	
	@Test
	public void example1() {
		
		int[] nums = {12,0,4,10, 0, 2};
		// 0, 0, 2, 4, 45
		System.out.println(Arrays.toString(moveZerosLeft(nums)));
		
	}
	
	// O(n) -> Time Complexity
	// O(1) -> Space Complexity
	private int[] moveZerosLeft(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				int temp = nums[j];
				nums[j++] = nums[i];
				nums[i] = temp;
			}
		}
		
		return nums;
	}

}
