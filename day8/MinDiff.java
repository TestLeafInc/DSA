package day8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class MinDiff {

	@Test
	public void test1() {
		Integer[] data = {5, 1, 3, 7, 3};
		List<Integer> asList = Arrays.asList(data);
		int minDiff = minDiff(asList);
		System.out.println(minDiff);
	}

	private int minDiff(List<Integer> lst) {
		
		if(lst.size() < 2) return 0;
		if(lst.size() == 2) return Math.abs(lst.get(0)-lst.get(1));
		
		Collections.sort(lst);
		int sum = 0;
		for (int i = 0; i < lst.size()-1; i++) {
			sum += Math.abs(lst.get(i) - lst.get(i+1));
		}
		return sum;
	}
}
