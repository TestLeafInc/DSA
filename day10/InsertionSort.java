package day10;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSort {
	
	@Test
	public void example1() {
		int[] data = {4,5,6,2,1,18};
		Assert.assertArrayEquals(insertionSort(data), new int[] {1,2,4,5,6,18});
	}
	
	@Test
	public void example2() {
		int[] data = {1,2,-3,6};
		Assert.assertArrayEquals(insertionSort(data), new int[] {-3,1,2,6});
	}
	
	@Test
	public void example3() {
		int[] data = {4,4,4,4};
		Assert.assertArrayEquals(insertionSort(data), data);
	}
	
	public int[] insertionSort(int data[]){
        int n = data.length;
        for (int i = 0; i < n; i++) {
            int pivot = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > pivot) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = pivot;
        }
        return data;
    }

}
