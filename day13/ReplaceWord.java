package day13;

import java.util.ArrayList;

import org.junit.Test;

public class ReplaceWord {
	
	String output = "";
	
	@Test
	public void example1() {
		System.out.println(replaceWord("Welcome to the interview. All the best to your test","to "));
	}

	private String replaceWord(String s1, String s2) {
		
		if(!s1.contains(s2)) return s1;
		return replaceWord(s1.replaceFirst(s2, ""),s2);
	}

	
}
