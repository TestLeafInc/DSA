package amazon;

import org.junit.Test;

public class BalanceParanthesis {
	
	@Test
	public void example1() {
		String str = ")(())()()))";
		int howMany = count(str);
		System.out.println(howMany);
	}

	private int count(String str) {
		
		int open = 0, closed = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				open++;
			} else closed++;
		}
		
		
		return Math.abs(closed-open);
	}

}
