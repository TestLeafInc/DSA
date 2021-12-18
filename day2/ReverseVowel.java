package day2;

import java.util.Arrays;

import org.junit.Test;

public class ReverseVowel {
	
	@Test // o(n/2)
	public void example1() {
		String s  = "hello";
		reverseVowel(s);
	}
	
	@Test //o(n/2)
	public void example2() {
		String s  = "aeiou";
		reverseVowel(s);
	}
	
	@Test // best --> o(n/2)
	public void example3() {
		String s  = "bcd";
		reverseVowel(s);
	}
	
	@Test // worst --> o(n)
	public void example4() {
		String s  = "abcd";
		reverseVowel(s);
	}

	/*
	 * 
	 */
	private void reverseVowel(String s) {
		char[] ch = s.toCharArray();
		int left = 0, right = ch.length-1;
		
		while(left < right) {
			if(isVowel(ch[left]) && isVowel(ch[right])) {
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
			} else if(isVowel(ch[left])) {
				right--;
			} else {
				left++;
			}
		}
		System.out.println(Arrays.toString(ch));
		
	}

	private boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		return false;
	}

	
}
