package day9;


import org.junit.Assert;
import org.junit.Test;

public class FindMinBracketsToMakeValid {
	
	@Test
	public void test1() {
		String brackets = "((";
		Assert.assertEquals(findMinBrackets(brackets), 2);
	}
	
	@Test
	public void test2() {
		String brackets = "(())))";
		Assert.assertEquals(findMinBrackets(brackets), 2);
	}
	
	@Test
	public void test3() {
		String brackets = "(()(";
		Assert.assertEquals(findMinBrackets(brackets), 2);
	}
	
	@Test
	public void test4() {
		String brackets = "))";
		Assert.assertEquals(findMinBrackets(brackets), 2);
	}

	/*
	 * Count the open and count the closed
	 * abs diff and return
	 * 
	 */
	private int findMinBrackets(String brackets) {
		
		char[] eachBrackets = brackets.toCharArray();
		int open = 0, closed = 0;
		for (char each : eachBrackets) {
			if(each == '(') open++;
			else closed++;
		}
		return Math.abs(closed-open);
	}

	
	

}



/*
 * Decode String
 * 2b(3c) --> bbccc
 * a3(bc2(d)) --> abcddbcddbcdd
 * 3(ab) --> ababab
 * 2d(3(a)) -> daaaadaaaa 
 * 
 */







