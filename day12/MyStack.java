package day12;

import java.util.ArrayDeque;
import java.util.Deque;

import org.junit.Test;

public class MyStack {
	
	Deque<Integer> queue;
	
	public MyStack(){
		queue = new ArrayDeque<>();
	}
	
	// offer --> add at the end !!
	// push ---> add to the top !!
	public void push(int x) {
		queue.offer(x);
		int size = queue.size();
		while(size > 1) {
			queue.offer(queue.poll());
			size--;
		}
	}
	
	public int pop() {
		return queue.poll();
	}
	
	public int top() {
		return queue.peek();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	@Test
	public void testMyStack() {
		MyStack stack  = new MyStack();
		stack.push(10);
		stack.push(11);
		stack.push(12);
		
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());


	}
}









