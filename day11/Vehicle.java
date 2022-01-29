package day11;

public interface Vehicle {
	
	
	public void soundHorn();
	
	// single code and supports backward compatibility
	default void applyBrake() {
		System.out.println("This is common brake");
	}
	
	static void getColor() {
		System.out.println("The color is red");
	}
}

//WebDriver (I)--> RWD  (c)--> ChromiumDriver  (c)--> ChromeDriver (c)
//WebDriver (I)--> RWD  (c)--> ChromiumDriver  (c)--> ChromeDriver (c)