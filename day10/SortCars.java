package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class SortCars {
	
	@Test
	public void sortZoomCars() {
		
		List<ZoomCars> cars = new ArrayList<>();
		cars.add(new ZoomCars("Hyundai i20", "Petrol", 1103, 2000));
		cars.add(new ZoomCars("Maruti Baleno", "Petrol", 916, 4000));
		cars.add(new ZoomCars("Hyundai Xcent", "Petrol", 970, 18000));
		cars.add(new ZoomCars("Maruti XCross", "Diesel", 1307, 1500));
		cars.add(new ZoomCars("Honda Amaze", "Diesel", 690, 12000));
		
		Collections.sort(cars, new Comparator<ZoomCars>() {

			@Override
			public int compare(ZoomCars car1, ZoomCars car2) {
				if(car1.getRun() < car2.getRun()) return -1;
				else if (car1.getRun() > car2.getRun()) return 1;
				else return 0;
			}
			
		});
		
		System.out.println(cars.toString());
		
	}

}
