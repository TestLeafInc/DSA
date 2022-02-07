package day13;

import org.junit.Test;

public class Factorial {
	
	/*
	 
	Rules to Solve Problems with Recursion
	1) Identify the simplest / smallest possible input (Base case)
	2) Build test data to visualize
	3) Break harder cases to simpler case 
	4) Generalize the pattern
	5) Finally, write the code to combine the pattern

	 */
	
	@Test
	public void example1() {
		factUsingRecursion(5);
	}

	private void factorial(int k) {
		int fact = 1;
		for (int j = k; j > 0; j--) {
			fact = fact * j;
		}
		System.out.println(fact);
	}
	
	/*
	 
	Rules to Solve Problems with Recursion
	1) Identify the smallest possible input (Base case) --> 1! --> 1
	2) Build test data to visualize (2! => 2x1!, 4! => 4x3! => 4x3x2! => 4x3x2x1! => ..)
	3) Break harder cases to simpler case ==> 10! -> 10x9!
	4) Generalize the pattern => n! --> n * (n-1) !
	5) Finally, write the code to combine the pattern

	 */

	private int factUsingRecursion(int k) {
		
		if(k == 1) return 1;
		int n = k * factUsingRecursion(k-1);
		return n;
	}
	
}
