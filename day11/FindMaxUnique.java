package day11;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class FindMaxUnique {

	@Test
	public void example1() {

		int[] nums = {4,5,2,2,5,1};
		int k = 3;
		// 3, 2, 2, 3 --> 3
		System.out.println(findMaxUniqueUsingQ(nums, k));
	}

	@Test
	public void example2() {

		int[] nums = {4,4,2,2,5,5};
		int k = 3;
		// 2, 2, 2, 2 --> 2
		System.out.println(findMaxUniqueUsingQ(nums, k));

	}

	@Test
	public void example3() {

		int[] nums = {4,4,4,4,4,4};
		int k = 3;
		System.out.println(findMaxUniqueUsingQ(nums, k));

		// 1
	}

	/*
	 * Take the first k values --> put it to the map
	 * Find the max of the map keys 
	 * 
	 * Loop through from k to the end 
	 * reduce i-k (map --> remove key or update key) and add i
	 * 
	 * finally find the max 
	 * 
	 */


	// O(n)  --> average case
	// O(n*k) --> worst 

	private int findMaxUnique(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) { 
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}

		int max = map.size();
		for (int i = k; i < nums.length; i++) {
			if(map.get(nums[i-k]) == 1) map.remove(nums[i-k]);
			else map.put(nums[i-k], map.get(nums[i-k])-1);
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			max = Math.max(max, map.size());
		}
		return max;
	}

	/*
	 * Add every element to the Set and Queue
	 * If the queue size == k
	 * 	a) remove the first
	 * 	b) If removed element from queue does not have any other occurances 
	 * 		then remove it from set as well
	 * 
	 *  find max -> max and size of the set 
	 *  
	 *  finally, return the max
	 * 
	 */
	

	// time complexity: O(n*k) 
	private int findMaxUniqueUsingQ(int[] nums, int k) {
		
		Set<Integer> set = new HashSet<>();
		Deque<Integer> deque = new ArrayDeque<>();
		int max = 1;
		
		for (int i = 0; i < nums.length; i++) { // O(n)
			set.add(nums[i]);
			deque.offer(nums[i]);
			
			if(deque.size() == k) {
				max = Math.max(max, set.size());
				Integer first = deque.poll();
				if(!deque.contains(first)) set.remove(first); //O(k)
			}
		}
		
		return max;
	}









}
