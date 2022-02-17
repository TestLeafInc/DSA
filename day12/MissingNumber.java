package day12;

import java.util.Arrays;

import org.junit.Test;

public class MissingNumber {
	
	@Test
	public void example1() {
		int[] nums = {0,1,5,2,3};
		int missed= missingNumber(nums);
		System.out.println(missed);
	}

	/*
	 * Sort the array 
	 * lowest number as for loop start point
	 * highest number as for loop end point
	 * compare i value with the array index --> if it does not match --> you found it !!
	 * 
	 * 0, 1, 2, 3, 5
	 * 0, 1, 2, 3, 4 --> 4 
	 * 
	 * 4, 2, 0, 1
	 * 0, 1, 2, 4
	 * 0, 1, 2, 3 --> 3
	 * 
	 * 
	 * n(n+1)/2  -> 5 * 6 / 2 --> 15
	 * actual sum -> 11 
	 * 15 - 11 -> 4
	 * 
	 * 
	 * 
	 * 
	 * 3, 7, 5, 6 --> 21
	 * 0,1,2,3, 5, 6, 7
	 * 3, 4    ---> 4 
	 * n(n+1)/2 --> (n(n+1)/2 )-(m*m+1)/2 --> 28 - 3 --> 25
	 * 25 - 21  --> 4
	 * 
	 * 
	 * 4,2,5,6 
	 * 
	 * (n(n+1)/2 )-(m*m+1)/2 --> n --> 6, m --> 1 
	 * 21-1 = 20 - 17 = 3 
	 * 
	 * 
	 * 
	 * When the number starts at 0 --> (n(n+1)/2 ) - sum
	 * When the number starts at any other positive number --> (n(n+1)/2 )-(m*m+1)/2 - sum
	 * 
	 * 
	 */
	
	// (n(n+1)/2 - sum
	// O(1)
	private int missingNumber(int[] nums) {
		return nums.length*(nums.length+1)/2 - Arrays.stream(nums).sum();
	}

}
