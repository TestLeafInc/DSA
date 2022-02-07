package day13;

import org.junit.Test;

public class PascalTriangle {
	
	@Test
	public void example1() {
		
		printPascal(5);
	}
	
	/*
	 
	 Rules to Solve Problems with Recursion

	1) Identify the simplest / smallest possible input (Base case) 
		a) Column (1) ==> 1
		b) Row = Column ==> 1
	
	2) Build test data to visualize (4,3) ==> (3,3) + (3,2) 
	3) Break harder cases to simpler case 
	4) Generalize the pattern
		row, column ==> rec(row-1, column) + rec(row-1, column-1)
	5) Finally, write the code to combine the pattern
	  
	 */
	
	private void printPascal(int row) {
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(pascalValue(i, j));
			}
			System.out.println();
		}
	}

	private int pascalValue(int row, int column) {
		if(column > row) throw new RuntimeException("Invalid Input");
		if(column == 1 || column == row) return 1; // Base case
		return pascalValue(row-1, column) + pascalValue(row-1, column-1);		
	}

}
