package day13;

import java.util.Iterator;

import org.junit.Test;

public class Fibbinocci {
	
	@Test
	public void example1() {
		printFibbi(5);
	}

	private void fibbinocci(int k) {
		int prev = 0;
		int next = 1;
		
		for (int i = 0; i < k; i++) {
			System.err.println(prev);
			int temp = prev + next;
			prev = next;
			next = temp;
		}
		
	}

	/*
	 
	 Rules to Solve Problems with Recursion

	1) Identify the simplest / smallest possible input (Base case) --> 1st -> 0 / 2nd -> 1
	2) Build test data to visualize (3 -> last 2 values -> 0 + 1 -> 1)
									(4 -> last 2 values -> next + prev -> 2)
	3) Break harder cases to simpler case  
	
		f5 = f4 + f3;
		f4 = f3 + f2
		f3 = f2 + f1;
	4) Generalize the pattern
		fn = f(n-1) + f (n-2)
	5) Finally, write the code to combine the pattern
	  
	 */
	
	private void printFibbi(int k) {
		for (int i = 0; i < k; i++) {
			System.out.println(fibbiUsingRecursion(i));
		}
	}
	
	private int fibbiUsingRecursion(int k) {
		
		if(k == 0) return 0;
		if(k == 1) return 1;
		int n = fibbiUsingRecursion(k-1)+fibbiUsingRecursion(k-2);
		return n;
	}
	
	
	/* 0 
	 * 1
	 * 1
	 * 2
	 * 3
	 */
}
