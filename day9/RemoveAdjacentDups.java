package day9;

import java.util.Stack;

import org.junit.Test;

public class RemoveAdjacentDups {

	@Test
	public void example1() {
		System.out.println(removeDuplicates("abbaca"));
	}

	@Test
	public void example2() {
		System.out.println(removeDuplicates("s"));
	}

	public String removeDuplicates(String s) {
		
		if(s.length() < 2 ) return s;

		Stack<Character> stack = new Stack<>();

		for(int i=0;i<s.length();i++){
			if(stack.isEmpty()) stack.push(s.charAt(i));
			else if(stack.peek()==s.charAt(i)) stack.pop();
			else stack.push(s.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()){
			sb=sb.append(stack.pop());
		}

		return sb.reverse().toString();


	}

}
