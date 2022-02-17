package day12;

public class ZoomCars {
	
	private String carName;
	private String type;
	private int price;
	
	public ZoomCars(String carName, String type, int price) {
		this.carName = carName;
		this.type = type;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return carName + " - "+ type + " - "+price ;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



}
