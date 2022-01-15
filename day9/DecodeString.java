package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class DecodeString {
	
	@Test
	public void example1() {
		System.out.println(decodeString("2[ab]"));
	}
	
	@Test
	public void example2() {
		System.out.println(decodeString("2[a3[b]]")); // abbbabbb
	}
	
	@Test
	public void example3() {
		System.out.println(decodeString("2[a3[bc]]")); // abcbcbcabcbcbc
	}
	
	@Test
	public void example4() {
		System.out.println(decodeString("2[b3[c]]")); // abcbcbcabcbcbc
	}
	
	@Test
	public void example5() {
		System.out.println(decodeString("112[a]")); // abcbcbcabcbcbc
	}

	/* DS: Stack and ArrayList
	 * 
	 * 1) Create Empty Stack
	 * 2) Convert String to char array
	 * 3) Loop each character (until it reaches the closing bracket)
	 * 		a) pop from the stack 
	 * 		b) Add to the ArrayList
	 * 		c) when you notice the opening bracket --> next char is freq 
	 * 		d) Check if it is a digit --> Append the same string to AL
	 * 		e) Reverse the string and push back to the stack
	 * 4) Repeat the step 3 until stack is empty !!
	 * 
	 */
	
	private String decodeString(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i] != ']') {
				stack.push(ch[i]);
			} else {
				
				List<Character> lst = new ArrayList<>();
				while(stack.peek() != '[') {
					lst.add(stack.pop());
				}
				// pop the next char --> this is the opening bracket
				stack.pop();
				
				// Get the frequency 
				String freq = "";
				while(!stack.isEmpty() && Character.isDigit(stack.peek())) 	{			
					freq = stack.pop()+""+freq;
				}
				
				int k = 1;
				if(freq != "") k = Integer.parseInt(freq);
				
				while(k > 0) { // push it back to the stack
					for (int j = lst.size()-1; j >= 0 ; j--) {
						stack.push(lst.get(j));
					}
					k--;
				}
			}
		}
		//System.out.println(stack);

		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.reverse().toString();
	}

}
