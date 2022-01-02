package day6;



import org.junit.Test;

public class BookStoreGrumpy {

	/*
	 * Problem Statement:
	 * 
	 * https://leetcode.com/problems/grumpy-bookstore-owner/
	 *
	 *  
	 * 1) Did I understand the problem? Yes or No !! - Yes 
	 * -> If No, Ask the person to provide more detail with example(s) 
	 * -> If yes, go to next step !!
	 * 
	 * What is the input(s)? - int[] customers, int[] grumpy and int minutes
	 * What is the expected output? - int
	 * Do I have constraints to solve the problem? - Slinding Window
	 *
	 *
	 * 2) Test Data Set
	 *  Minimum of 3 data set !!
	 *   
	 *  Positive : customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1]  minutes = 3
	 *   
	 *  Edge     : customers = [1], grumpy = [1]  minutes = 1
	 *  
	 *  Negative : customers = [1], grumpy = [1,1]  minutes = 1
	 *
	 */
	
	@Test
	public void test1() {
		int[] customers = {1,0,1,2,1,1,7,5};
		int[] grumpy    = {0,1,0,1,0,1,0,1};
		int minutes		= 5;
		System.out.println(maxSatisfied(customers, grumpy, minutes));
	}


	@Test
	public void test2() {
		int[] customers = {3,2,5};
		int[] grumpy    = {0,1,1};
		int minutes		= 2;
		System.out.println(maxSatisfied1(customers, grumpy, minutes));
	}

	//Three Pass
	public int maxSatisfied(int[] customers, int[] grumpy, int k) {
		int maxCustomers = 0, currentCustomers = 0;
		for (int i = 0; i < grumpy.length; i++) {
			if (grumpy[i] == 0)
				currentCustomers += customers[i];
		}
		maxCustomers = currentCustomers;
		for (int i = 0; i < k; i++) {
			if (grumpy[i] == 1)
				currentCustomers += customers[i];

		}
		maxCustomers = Math.max(maxCustomers, currentCustomers);
		for (int i = k; i < grumpy.length; i++) {
			if (grumpy[i - k] == 1)
				currentCustomers -= customers[i - k];
			if (grumpy[i] == 1)
				currentCustomers += customers[i];
			maxCustomers = Math.max(maxCustomers, currentCustomers);
		}
		return maxCustomers;
	}

	//TwoPass
	public int maxSatisfied1(int[] customers, int[] grumpy, int k) {
		int maxCustomers = 0, currentCustomers = 0;
		for (int i = 0; i < grumpy.length; i++)
			if (grumpy[i] == 0) currentCustomers += customers[i];

		maxCustomers = currentCustomers;
		for (int i = 0; i < grumpy.length; i++) {
			if (grumpy[i] == 1) currentCustomers += customers[i];
			if(i >=k && (grumpy[i-k] == 1)) currentCustomers -= customers[i-k];
			maxCustomers = Math.max(maxCustomers, currentCustomers);
		}
		return maxCustomers;
	}

	//Optimized
	public int maxSatisfied2(int[] customers, int[] grumpy, int minutes) {
		int happyCustomers = 0, maxChange = 0, currentChange=0;
		for (int i = 0; i < customers.length; i++) {
			if(grumpy[i] == 0) happyCustomers += customers[i];
			if(grumpy[i] == 1) currentChange += customers[i];
			if(i>=minutes && grumpy[i-minutes] == 1) currentChange -= customers[i-minutes];
			maxChange = Math.max(currentChange, maxChange);
		}
		return happyCustomers+maxChange;
	}
}