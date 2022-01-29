package day11;

public class Laptop {

	public static void main(String[] args) {
		
		Computer comp = (brand, model) -> {
			if(brand.equals("dell") && model.equals("xps")) return "Win11";
			else return null;
		};
		
		String osVersion = comp.getOsVersion("compaq", "beta");
		System.out.println(osVersion);
	}
}
