package day2;

import java.util.Arrays;

import org.junit.Test;

public class ArrayIntersection {

	@Test
	public void example1() {
		int[] nums1 = {1,2,11,12};
		int[] nums2 = {2,12};
		intersection(nums1, nums2);
	}
	
	@Test
	public void example2() {
		int[] nums1 = {1,2,11,12};
		int[] nums2 = {1,2,11,12};
		intersection(nums1, nums2);
	}
	
	@Test
	public void example3() {
		int[] nums1 = {1,2,11,12};
		int[] nums2 = {123,123,212};
		intersection(nums1, nums2);
	}

	private void intersection(int[] nums1, int[] nums2) {
		
		int left = 0, right = 0;
		boolean bIntersection = false;
		
		while(left < nums1.length && right < nums2.length) {
			
			if(nums1[left] == nums2[right]) {
				System.out.println(nums1[left]);
				bIntersection = true;
				left++;
				right++;
			} else if(nums1[left] < nums2[right]) {
				left++;
			} else {
				right++;
			}
			
		}
	
		if(!bIntersection)
			System.err.println("There is no intersection");
		
	}
	
	
	
}
