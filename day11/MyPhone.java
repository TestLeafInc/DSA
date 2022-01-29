package day11;

public class MyPhone {
	
	public static void main(String[] args) {
		
		Android myPhone = new Android();
		myPhone.closeApp();
		int version = Mobile.getVersion();
		System.out.println(version);
	}

}
