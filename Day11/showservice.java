package Collections;

import java.util.HashMap;
import java.util.Set;

public class showservice {

	public static void main(String[] args) {

	Car car=new Car("V8Dielsel", "FERRARI");
	Car car1=new Car("V4Diesel", "BENTLY");
	Car car2=new Car("V9Petrol", "BMW");
	Car car3=new Car("V6Petrol", "Audi");


	Showroom showroom=new Showroom();
	showroom.setShowName("CENTRAL SHOWROOM");

	HashMap<String, Car> cars=new HashMap<>();

	cars.put(car.getCarid(),car);
	cars.put(car1.getCarid(),car1);
	cars.put(car2.getCarid(),car2);
	cars.put(car3.getCarid(),car3);


	showroom.setCars(cars);

	HashMap<String,Car> showroomCars=(HashMap<String,Car>)showroom.getCars();
	System.out.println("V8Diesel");
	
	
	
	Set<String> keys = showroomCars.keySet();
	//System.out.println("The set is: " + keyset);
	
	
	System.out.println(showroomCars.get("V6Petrol"));

	for(String key:keys)
	{
		System.out.println(showroomCars.get(key));
		
	}
	
	}

	}

