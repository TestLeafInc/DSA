package day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class HashMapInternals {

	@Test
	public void internals() {

		String text = "Anil";
		String text1 = "Haja";

		// Get the hashcode -> int 
		System.out.println(text.hashCode());
		int hashCode = text.hashCode();

		int n = 64; // 2^4

		// Get the index
		int index = hashCode & (n-1);
		System.out.println(index);

		// Get the hashcode -> int 
		System.out.println(text1.hashCode());
		int hashCode1 = text1.hashCode();

		// Get the index
		int index1 = hashCode1 & (n-1);
		System.out.println(index1);

		// Terminology - Bucket, LinkedList (Node), Collision, 
		// Initial and Max Capacity, Default Load Factor

		Map<String, Integer> map = new HashMap<String, Integer>(250,0.8f);
		map.put("Babu", 42);
		map.put("Hari", 40);
		map.put("Haja", 28);

		int age = map.get("Hari");
		System.out.println(age);

	}


}
