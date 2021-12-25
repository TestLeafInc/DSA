package day4;

import java.util.HashSet;

import org.junit.Test;

public class LongestSubString {
	
	
	@Test
	public void example1() {
		String s = "abcabcbb";
		longestSubString(s);
		
	}
	
	@Test
	public void example2() {
		String s = "bbbbb";
		longestSubString(s);
		
	}
	
	@Test
	public void example3() {
		String s = "pwwkew";
		longestSubString(s);
		
	}
	/*
	 * Algorithm : Sliding Window / Hashing Algorithm
	 * 
	 * 1) Two pointers - equi - left , right = 0
	 * 2) Create HashSet 
	 * 3) Right -> Fast Pointer -> Move to every character
	 * 4) Check if that character exist in the set --> 
	 * 		a) reset your right with left, increment before reset !!
	 * 		b) clear your set !!
	 * 
	 */
	
	private void longestSubString(String s) {
		
		int left = 0, right = 0, maxCount = 0;
		HashSet<Character> set = new HashSet<Character>();
		
		while(right < s.length()) {
			if(set.add(s.charAt(right++))) {
				maxCount = Math.max(maxCount, set.size());
			} else {
				right = ++left;
				set.clear();
			}
		}
		System.out.println(maxCount);
		
	}
	
	

}
