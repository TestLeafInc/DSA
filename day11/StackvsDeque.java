package day11;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

import org.junit.Test;

public class StackvsDeque {
	
	@Test
	public void deque() {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		//System.out.println(new ArrayList<>(stack));
		//System.out.println(stack.pop());
		// push and pop !!
		
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.offer(10);
		deque.offer(11);
		deque.offer(12);
		System.out.println(new ArrayList<>(deque));
		System.out.println(deque.poll()); // offer and poll !!
		
		
	}

}
