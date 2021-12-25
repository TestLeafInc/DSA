package day4;

import java.util.HashMap;

import javax.management.RuntimeErrorException;

import org.junit.Test;

public class FindAnagrams {
	
	@Test
	public void example1() {
		String s = "cbaebabacd";
		String p = "adc";
		findAllAnagramsUsingSlidingWindow(s,p);
	}
	
	@Test
	public void example2() {
		String s = "cb";
		String p = "abc";
		findAllAnagrams(s,p);
	}
	
	@Test
	public void example3() {
		String s = "cbb";
		String p = "abc";
		findAllAnagrams(s,p);
	}

	/*
	 * Algorithm : Sliding Window with Hash
	 * 
	 * Psuedocode
	 * 
	 * 1) Create Hashmap for s, p
	 * 2) Iterate the p string once to fill the map !!
	 * 3) Iterate the s string for the length of p
	 * 		a) Get the characters and fill the map
	 * 		b) Remove the first character and add the new character 
	 * 4) Compare both maps and print if it matches !!
	 * 
	 * Edge Case: 
	 * 
	 * 
	 */
	
	private void findAllAnagrams(String s, String p) {
		int sLength = s.length(), pLength = p.length();
		
		if(pLength > sLength)
			new RuntimeException("Given Input is wrong");
		
		HashMap<Character, Integer> pMap = new HashMap<>();
		HashMap<Character, Integer> sMap = new HashMap<>();
		
		for (int i = 0; i < pLength; i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < sLength-pLength; i++) {
			for (int j = i; j < pLength+i; j++) {
				sMap.put(s.charAt(j), sMap.getOrDefault(s.charAt(j), 0)+1);
			}
			if(pMap.equals(sMap)) {
				System.out.println("Matches");
			}
			sMap.clear();
		}

	}
	
	// Time Complexity: O(n)
	// Space Complexity: O(2m) => O(m)
	private void findAllAnagramsUsingSlidingWindow(String s, String p) {
		int sLength = s.length(), pLength = p.length();
		
		if(pLength > sLength)
			new RuntimeException("Given Input is wrong");
		
		HashMap<Character, Integer> pMap = new HashMap<>();
		HashMap<Character, Integer> sMap = new HashMap<>();
		
		for (int i = 0; i < pLength; i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0)+1);
		}
		
		// Push into sMap only pLength character 
		// Add the new character, Delete the old character
		for (int i = 0; i < sLength; i++) {
			
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0)+1);
			
			// when it is bigger than pLength
			if(i >= pLength) {
				char ch = s.charAt(i-pLength); // this is character to delete
				
				// if it is just one occurance --> delete the key
				// if it is multiple occurance --> update with value - 1
				
				if(sMap.get(ch) == 1) {
					sMap.remove(ch); // --> delete the key
				} else {
					sMap.put(ch, sMap.get(ch)-1); // --> update with value - 1
				}
			}
			
			if(i >= pLength && sMap.equals(pMap)) {
				System.out.println("Matches !!");
			}
			
			
			
		}

	}


}
