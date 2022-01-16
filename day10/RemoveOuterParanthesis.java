package day10;

import org.junit.Test;

import java.util.Stack;

import org.junit.*;

public class RemoveOuterParanthesis {

	
	@Test
	public void example1() {
		Assert.assertEquals(removeOuter("(()())(())"), "()()()");
	}
	
	

	@Test
	public void example2() {
		Assert.assertEquals(removeOuter("(()())(())(()(()))"), "()()()()(())");
	}
	
	private String removeOuter(String str) {
		Stack<Character> stack  = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i] == '(') {
				if(stack.size() >= 1) sb.append(ch[i]);
				stack.push(ch[i]);
			} else {
				if(stack.size() > 1) sb.append(ch[i]);
				stack.pop();
			}
		}
		return sb.toString();
	}
}
