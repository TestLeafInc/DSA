package day12;

import java.util.Arrays;

import org.junit.Test;

public class FindMaxNumber {
	
	@Test
	public void example1() {
		int[] nums = {3,5,1,13,11,8};
		findMax(nums);
		System.out.println(findMin(nums));
	}

	private void findMax(int[] nums) {
		
		Arrays.stream(nums).reduce((a,b) -> (a > b ? a:b))
		.ifPresent(max -> System.out.println(max));
	}
	
	private int findMin(int[] nums) {
		return Arrays.stream(nums).reduce((a,b) -> (a < b ? a:b))
		.orElse(Integer.MIN_VALUE);
	}

}
