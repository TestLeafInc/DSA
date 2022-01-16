package day10;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSort {
	
	@Test
	public void test1() {
		int[] data = {-2, 0, 12, -4, 13, 8, 11};
		Assert.assertArrayEquals(bubbleSort(data), new int[] {-4,-2,0,8,11,12,13});
	}

	@Test
	public void test2() {
		int[] data = {1,2,3,4};
		Assert.assertArrayEquals(bubbleSort(data), new int[] {1,2,3,4});
	}
	
	@Test
	public void test3() {
		int[] data = {4,4,4,4,4};
		Assert.assertArrayEquals(bubbleSort(data), new int[] {4,4,4,4,4});
	}
	
	private int[] bubbleSort(int[] data) {
		int temp;
		for (int i = 0; i < data.length; i++) {
			for (int j = 1; j < data.length-i; j++) {
				if(data[j-1] > data[j]) {
					temp = data[j];
					data[j] = data[j-1];
					data[j-1] = temp;
				}
			}
		}
		
		return data;
	}

}








