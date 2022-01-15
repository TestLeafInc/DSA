package day9;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.*;

public class ValidParanthesis {
	
	@Test
	public void example1() {
		String str = "()";
		Assert.assertEquals(true, isValid(str));
	}

	@Test
	public void example2() {
		String str = "([])";
		Assert.assertEquals(true, isValid(str));
	}
	
	@Test
	public void example3() {
		String str = "([]){[(())]}";
		Assert.assertEquals(true, isValid(str));
	}
	
	@Test
	public void example4() {
		String str = "())";
		Assert.assertEquals(false, isValid(str));
	}
	
	/* Algorithm: Stack and Map
	 * 
	 * 1) Convert the String into character array 
	 * 2) Create a Map with key (closing brackets) and value (open brackets)
	 * 3) Loop through each character 
	 * 		a) Check if the char exist in the Map as key
	 * 			i) Exist: Pop the stack value and compare the map value 
	 * 			ii) If matches --> continue, else --> return false;
	 * 		b) If the char does not exist --> push to the stack
	 * 4) finally, return the boolean --> if the stack is empty -> true else false
	 * 
	 */

	/* 
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 * 
	 */
	private boolean isValid(String str) {
		
		char[] bracket = str.toCharArray();
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < bracket.length; i++) {
			if(map.containsKey(bracket[i]))
				if(stack.isEmpty() || stack.pop() != map.get(bracket[i])) return false;
			else 
				stack.push(bracket[i]);
		}
		return stack.isEmpty();
	}


}
