package day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordPattern {

	@Test
	public void example1() {
		String str = "dog cat cat dog";
		String pattern = "abba";
		System.out.println(wordPattern(str, pattern));
	}

	/*
	 * Algorithm : Hashing 
	 * 
	 * Psuedo code
	 * 1) Create 2 Map
	 * 2) Map the string as key to the pattern as value
	 * 3) Map the pattern as key to the string as key
	 * 4) Compare both
	 * 		a) If there is no entry on both --> Create entry for both
	 * 		b) If there is an entry in one of these --> Compare both ; if either one does not match --> return false !!
	 */

	public boolean wordPattern(String s, String pattern) {
		
		Map<Character, String> charMap = new HashMap<>();
		Map<String, Character> wordMap = new HashMap<>();
		
		String[] words = s.split(" ");
		if (pattern.length() != words.length) return false;
		
		int i = 0;
		while (i < words.length){
			char c = pattern.charAt(i);
			String word = words[i++];
		
			if (!charMap.containsKey(c) && !wordMap.containsKey(word)){
				charMap.put(c, word);
				wordMap.put(word,c);
			}else if (charMap.containsKey(c) && !word.equals(charMap.get(c)))
				return false;
			else if(wordMap.containsKey(word) && c != wordMap.get(word))
				return false;
		}
		return true;

	}

}
