package day3;


import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArray {

	@Test // positive
	public void example1() {
		int[] nums1 = {1,2,4};
		int[] nums2 = {2,3,5};
		mergeArray(nums1, nums2);
	}


	/*
	 * Time complexity: O(n+m)
	 * Space complexity: O(n+m)
	 */
	private void mergeArray(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int[] output = new int[m+n];
		int left = 0, right = 0, index = 0;
		while(left < m || right < n) {
			if(left == m) output[index++] = nums2[right++];
			else if(right == n) output[index++] = nums1[left++];
			if(nums1[left] <= nums2[right]) output[index++] = nums1[left++];
			else output[index++] = nums2[right++];
		}
		System.out.println(Arrays.toString(output));
	}


}