package amazon;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.junit.Test;

public class MostOrLeast {
	
	@Test
	public void example1() {
		String str = "dddddccccc";
		findMostOrLeast(str);
	}

	private void findMostOrLeast(String str) {
		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.toCharArray();
		for (char c : ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		//System.out.println(map);
		
		List<Entry<Character, Integer>> lstEntries = map.entrySet().stream().sorted(
				Collections.reverseOrder(Map.Entry.comparingByValue()))
			.collect(Collectors.toList());
		
		System.out.println(lstEntries.get(1).getKey());
		
	}

}
