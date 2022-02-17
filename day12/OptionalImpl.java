package day12;

import java.util.Optional;

import org.junit.Test;

public class OptionalImpl {
	
	// Scala, VB Script 
	
	@Test
	public void learnOptional() {
		
		String[] names = new String[3];
		names[0] = "Babu";
		names[1] = "Hari";
		names[2] = "Prakash";
		
		boolean landscape;
		Optional<String> thirdPerson = Optional.ofNullable(names[2]);
		if(!thirdPerson.isPresent()) {
			landscape = false;
			System.out.println("The first character is " +names[2].charAt(0));
		}
		

		
	}
	
	// Selenium 4 uses devtools --> Chrome Devtools, Firfox Devtools 

}
