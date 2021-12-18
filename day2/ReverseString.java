package day2;

import org.junit.Test;

public class ReverseString {
	
	@Test
	public void example1() {
		String s = "hello";
		reverseUsing2Pointer(s);
	}

	// O[n]
	private void reverseString(String s) {
		char[] ch = s.toCharArray();  	// mem copy		
		for (int i = ch.length-1; i >=0; i--) { // O[n]
			System.out.print(ch[i]);
		}
		
	}
	
	private void reverseUsing2Pointer(String s) {
		char[] ch = s.toCharArray();  			
		int left = 0, right = ch.length-1;
		while (left < right) { // O(n/2) => o(n)
			// swap
			char temp = ch[right];
			ch[right--] = ch[left];
			ch[left++] = temp;
		}
		System.out.println(new String(ch));
	}

}


/*
 * Given 2 int sorted arrays, print the intersection elements 
 * of two arrays 
 * 
 * int[] arr1 = {2,3,5,6,8,10};
 * int[] arr2 = {2,4,5,7,8};
 * 
 * 2,5,8
 * 
 */














