package day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MatchingPattern {

	@Test
	public void example1() {
		String[] str = {"abb", "abc", "xyz", "xyy"};
		String pattern = "mnn";
		System.out.println(getAllMatchingPatterns(str, pattern));
	}

	@Test
	public void example2() {
		String[] str = {"abb", "abc", "xyz", "xyy"};
		String pattern = "mno";
		System.out.println(getAllMatchingPatterns(str, pattern));
	}

	
	private boolean isMatchingPattern(String word, String pattern) {

		int len = word.length();
		if (pattern.length() != len) return false;
		int[] ch = new int[128];

		for(int i = 0; i < len; i++){
			if (ch[(int)pattern.charAt(i)] == 0) { // should check that value does not exist in the given char array
				for (int j = 0; j < ch.length; j++) {
					if(ch[j] ==  word.charAt(i)) return false;
				}
				ch[(int)pattern.charAt(i)] = word.charAt(i);
			}else if (ch[(int)pattern.charAt(i)] != word.charAt(i))
				return false;
		}
		return true;
	}


	// Time complexity: O[n*m*128]
	private List<String> getAllMatchingPatterns(String[] str, String pattern){
		List<String> lst = new ArrayList<String>();
		for(String word : str)
			if (isMatchingPattern(word, pattern)) lst.add(word);
		return lst;
	}
}
