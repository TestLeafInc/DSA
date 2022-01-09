package day8;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		//System.out.println(map);
		List<Integer> lst = new ArrayList<>();
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			lst.add(entry.getValue());
		}
		Collections.sort(lst);
		//System.out.println(lst);
		int index = 0;
		for (int i = 0; i < lst.size(); i++) {
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				if(lst.get(i) == entry.getValue()) {
					int freq = entry.getValue();
					while(freq > 0) {
						nums[index++] = entry.getKey();
						freq--;
					}
					map.put(entry.getKey(), 0);
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
		
		
		
		
		
	}
}
