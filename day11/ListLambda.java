package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListLambda {
	
	@Test
	public void listExamples() {
		
		List<String> names = new ArrayList<>();
		names.add("Babu");
		names.add("Hari");
		names.add("Abi");
		names.add("Anand");
		names.add("Bharath");
		
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if(names.get(i).length() > 3) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	// predicate --> Functional Interface that takes only one argument and returns boolean
	
	@Test
	public void listExamples1() {
		List<String> names =  Arrays.asList("Babu","Hari","Abi","Anand","Bharath");
		long count = names.stream().filter(firstNames -> firstNames.length() > 3).count();
		System.out.println(count);
		
	}
	
	
	
	
	
	
	

}
