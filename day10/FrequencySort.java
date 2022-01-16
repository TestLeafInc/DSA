package day10;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class FrequencySort {

	@Test
	public void test1() {
		int[] data = {3,4,6,2,4,2};
		frequencySort(data);
	}

	private void frequencySort(int[] nums) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i],0)+1);
		}
		List<Entry<Integer,Integer>> lst = new ArrayList<>(map.entrySet());
		Collections.sort(lst, new Comparator<Map.Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				if(e1.getValue() > e2.getValue()) return 1;
				else if (e1.getValue() < e2.getValue()) return -1;
				return 0;
			}
		});
		
		for (Entry<Integer, Integer> entry : lst) {
			Integer freq = entry.getValue();
			while(freq > 0) {
				System.out.println(entry.getKey());
				freq--;
			}
		}
	
		
	}
}
