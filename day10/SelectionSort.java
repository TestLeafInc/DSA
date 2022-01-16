package day10;


import org.junit.Assert;
import org.junit.Test;

public class SelectionSort {

	@Test
	public void test1() {
		int[] data = {4,5,6,2,1,18};
		Assert.assertArrayEquals(selectionSort(data), new int[] {1,2,4,5,6,18});

	}
	
	@Test
	public void test2() {
		int[] data = {4,5,-6,2,1,-18};
		Assert.assertArrayEquals(selectionSort(data), new int[] {-18,-6,1,2,4,5});
	}
	
	@Test
	public void test3() {
		int[] data = {4,4,4,4,4,4};
		Assert.assertArrayEquals(selectionSort(data), new int[] {4,4,4,4,4,4});
	}
	
	public int[] selectionSort(int data[]){
        
		for (int i = 0; i < data.length; i++) {
			int min = i;
			for (int j = i+1; j < data.length; j++) {
				if(data[min] > data[j]) min = j;
			}
			int temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
		return data;
    }
}






