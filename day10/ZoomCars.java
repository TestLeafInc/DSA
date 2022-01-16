package day10;

public class ZoomCars {
	
	private String carName;
	private String type;
	private int price;
	private int run;
	
	public ZoomCars(String carName, String type, int price, int run) {
		this.carName = carName;
		this.type = type;
		this.price = price;
		this.run = run;
	}
	
	@Override
	public String toString() {
		return carName + " - "+ type + " - "+price + " - "+run;
	}

	public String getCarName() {
		return carName;
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public int getRun() {
		return run;
	}

	public void setPrice(int run) {
		this.run = run;
	}



}
