package amazon;

import org.junit.Test;

public class StringManipulation {
	
	@Test
	public void example1() {
		
		System.out.println(convert("aBCde"));
	}
	// aABbCcdDeE

	// Time complexity: O(n)
	// Space complexity: O(n)
	private String convert(String str) {
		
		StringBuilder sb = new StringBuilder();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			sb.append(c);
			if(Character.isLowerCase(c)) sb.append(Character.toUpperCase(c));
			else sb.append(Character.toLowerCase(c));
		}
		return sb.toString();
	}

}
