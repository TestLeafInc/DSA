package day11;



import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;

public class FindUnique {
	
	@Test
	public void findUniqueCount() {
		
		List<Integer> lst = Arrays.asList(2,5,2,6,7,1,7,1);
		//long count = lst.stream().distinct().count();
		//System.out.println(count);
		List<Integer> unique = lst.stream().distinct().collect(Collectors.toList());
		System.out.println(unique);
		
	}
	
	@Test
	public void findDups() {
		
		List<Integer> lst = Arrays.asList(2,5,2,6,7,1,7,1,7,7);
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> dups = lst.stream().filter(item -> !set.add(item)).collect(Collectors.toSet());
		System.out.println(dups);
	}

}






