package day11;

import java.util.ArrayDeque;
import java.util.Stack;

import org.junit.Test;

public class RotateArrayPartially {
	
	@Test
	public void example1() {
		int[] nums = {4,6,8,11,10,18};
		int k = 3;
		// 8,6,4,11,10,18
		rotateKElements(nums, k);
	}


	@Test
	public void example2() {
		int[] nums = {10,10,60,40,20,10,50};
		int k = 4;
		rotateKElements(nums, k);

		// 40, 60, 10, 10, 20, 10, 50
	}
	
	
	
	
	/* DS: Stack and Queue
	 * 
	 * Iterate every element in the array
	 * 1) For the first k elements -> push it to the stack
	 * 2) For the rest of the elements -> offer it to the queue
	 * 
	 * Retrieve the item from the stack (pop) and add to 
	 * 	front of the queue
	 * 
	 * poll from the queue finally !!
	 * 
	 */
	
	
	
	
	
	
	
	private void rotateKElements(int[] nums, int k) {
		
		Stack<Integer> stack = new Stack<>();
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(i < k) stack.push(nums[i]);
			else deque.offer(nums[i]);
		}
		
		for (int i = 0; i < k; i++) {
			deque.offer(stack.pop());
		}
		
		for (int i = 0; i < nums.length-k; i++) {
			deque.offer(deque.poll());
		}
		System.out.println(deque);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
