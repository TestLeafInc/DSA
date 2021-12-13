package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElement {
	
	/*
	 * static array and dynamic array !!
	 * 
	 * static array --> Length fixed --> number of elements is declared at the begining
	 * you cannot resize them --> resize?? --> create another array (Arrays.copyOf)
	 * 
	 * Dynamic array --> Array size that can change (grow or shrink) 
	 * List / Set / Map  
	 * 
	 */
	
	// Constraint --> 
	
	@Test // positive
	public void example1() {
		int[] nums = {5,3,2,1,2,3};
		int target =  3;
		int[] out =  removeElement(nums, target);
		Assert.assertTrue(Arrays.equals(out, new int[] {5,2,1,2}));
	}
	
	@Test // negative
	public void example3() {
		int[] nums = {};
		int target =  3;
		int[] out =  removeElement(nums, target);
		Assert.assertTrue(Arrays.equals(out, new int[] {}));
	}
	
	/*
	 * Traverse through each element in the array
	 * Compare that element with the target
	 * 	If matches --> ignore !
	 * 	If does not match --> add to a list
	 * 
	 * After the loop end, convert list to array
	 * return the array 
	 * 
	 */
	
	public int[] removeElement(int[] nums, int target) {
		
		if(nums.length == 0) return nums; // negative cases first !!
		
		List<Integer> lst = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.length; i++) { // traverse and add only if the element not matching
			if(nums[i] != target) lst.add(nums[i]);
		}
		
		int[] output = new int[lst.size()];
		for (int i = 0; i < lst.size(); i++) {
			output[i] = lst.get(i);
		}
		
	    return output;
	}

}
