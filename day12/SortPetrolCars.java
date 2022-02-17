package day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.Test;

public class SortPetrolCars {
	
	@Test
	public void sortZoomCars() {
		
		List<ZoomCars> cars = new ArrayList<>();
		cars.add(new ZoomCars("Hyundai i20", "Petrol", 1103));
		cars.add(new ZoomCars("Maruti Baleno", "Petrol", 916));
		cars.add(new ZoomCars("Hyundai Xcent", "Petrol", 916));
		cars.add(new ZoomCars("Maruti XCross", "Diesel", 1307));
		cars.add(new ZoomCars("Honda Amaze", "Diesel", 690));
		
		/*Map<Integer, List<ZoomCars>> sortedCars = 
				cars.stream().collect(Collectors.groupingBy(ZoomCars::getPrice));*/
		
		List<ZoomCars> sortedCars = cars.stream()
				.filter(car -> car.getType().equals("Petrol"))
				.sorted(Comparator.comparing(ZoomCars::getCarName))
				.sorted(Comparator.comparing(ZoomCars::getPrice))
				.collect(Collectors.toList());
		System.out.println(sortedCars.toString());
		
	}

}
