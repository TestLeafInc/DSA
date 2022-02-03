package amazon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ArrayIntersection {
	
	@Test
	public void example1() {
		char[] nums1 = {'a', 'k', 'd', 'e', 'd'};
		char[] nums2 =  {'e', 'f', 'z', 'd', 'l', 'd'};
		
		char[] intersect = findIntersection(nums1, nums2);
		System.out.println(Arrays.toString(intersect));
	}

	// Time complexity: O(n+m+k) 
	// Space complexity: O(n+m+k) 
	private char[] findIntersection(char[] nums1, char[] nums2) {
		
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		
		for (Character character : nums1) set1.add(character);
		for (Character character : nums2) set2.add(character);
		
		set1.retainAll(set2);
		
		char[] output = new char[set1.size()];
		int i = 0;
		for (char c : set1) {
			output[i++] = c; 
		}
		return output;
	}

}
