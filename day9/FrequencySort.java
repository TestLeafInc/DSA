package day9;



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
		List<Entry<Integer,Integer>> lst = new ArrayList<>(map.entrySet());
		Collections.sort(lst, Map.Entry.comparingByValue());
		//System.out.println(lst);
		
		for (Entry<Integer, Integer> entry : lst) {
			Integer freq = entry.getValue();
			while(freq > 0) {
				System.out.println(entry.getKey());
				freq--;
			}
		}

		
		//System.out.println(Arrays.toString(nums));
		
		// 1.5 L --> 75,000 --> 75 K sitting in bank --> 4% 
		// Fixed Deposit --> 1 L accured in your bank --> Automated Fixed Bank !! 
		// Next 6 months --> 6 Fixed Deposits --> 
		// You need to withdraw 50K --> 
		// 6, 5, 4, 3, 2, 1 
		// fifo / lilo // lifo 
		
		
		
		
	}
}
