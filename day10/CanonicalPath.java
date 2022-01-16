package day10;

import java.util.Stack;
import org.junit.Test;
import org.junit.*;

public class CanonicalPath {
	

	@Test
	public void test1() {
		String s = "/a/./b/../../c/";
		Assert.assertTrue(findPath(s).equals("/c"));
	}
	
	@Test
	public void test2() {
		String s = "/home//foo";
		Assert.assertTrue(findPath(s).equals("/home/foo"));
	}
	
	@Test
	public void test3() {
		String s = "/../";
		Assert.assertTrue(findPath(s).equals("/"));
	}

	/*
	 * Split the string by /
	 * traverse through each string 
	 * 		-> empty or dot -> ignore
	 * 		-> .. -> pop
	 * 		-> else -> push 
	 * convert the stack to string thru appending / 
	 * 
	 */
	
	
	private String findPath(String s) {
		
		String[] split = s.split("/");
		Stack<String> stack = new Stack<>();
		for (String eachString : split) {
			if(eachString.isEmpty() || eachString.equals(".")) continue;
			else if(eachString.equals("..")) {
				if(!stack.isEmpty()) 
					stack.pop();
			}
			else stack.push(eachString);
		}
		
		StringBuilder sb = new StringBuilder();
		if(stack.isEmpty()) sb.insert(0, "/");
		
		while(!stack.isEmpty()) {
			sb.insert(0, stack.pop());
			sb.insert(0, "/");
		}
				
		return sb.toString();
	}
}















