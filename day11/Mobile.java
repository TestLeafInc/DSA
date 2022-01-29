package day11;

public interface Mobile {
	
	default void closeApp() {
		System.out.println("App closed");
	}
	
	static int getVersion() {
		return 11;
	}

}
