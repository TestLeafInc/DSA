package day13;

import org.junit.Test;

public class ReverseString {
	
	private String output = "";
	
	@Test
	public void example1() {
		String s = "hello";
		System.out.println(reverseUsingRecursion(s));
	}

	private String reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	/*
	 *  Input length ==> 0 --> return input !!
	 *  Call recursively --> 0 --> n (len-1)
	 *  Get the last character -> append to the string
	 *  final the return appended 
	 */
	private String reverseUsingRecursion(String s) {
		
		if(s.length() == 0) return s;
		
		// Get the last character and append to the String
		output = output + s.charAt(s.length()-1);
		
		// recursively call npw
		System.out.println(s.substring(0, s.length()-1));
		reverseUsingRecursion(s.substring(0, s.length()-1));
		
		return output;
	}

}
