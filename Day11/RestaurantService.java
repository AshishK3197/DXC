package Collections;

import java.util.HashMap;
import java.util.Set;

public class RestaurantService {

	public static void main(String[] args) {
		
		FoodItems fooditems = new FoodItems("#567", "Lasagna");
		FoodItems fooditems1 = new FoodItems("#568", "Paneer Butter Masala");
		FoodItems fooditems2 =  new FoodItems("#123", "Malabar Roti");
		FoodItems fooditems3 = new FoodItems("#569", "Chicken Chilli");
		
		
		Restaurant restaurant = new Restaurant();
		restaurant.setShowFood("BANGALORE CUISINE");
		
		
		HashMap<String, FoodItems>food = new HashMap<>();
		
		
		food.put(fooditems.getFoodid(),fooditems);
		food.put(fooditems1.getFoodid(),fooditems1);
		food.put(fooditems2.getFoodid(),fooditems2);
		food.put(fooditems3.getFoodid(),fooditems3);
		
		
		restaurant.setFoods(food);
		
		HashMap<String, FoodItems>restaurantFoods = (HashMap<String, FoodItems>)restaurant.getFoods();
		
		Set<String> keys = restaurantFoods.keySet();
		System.out.println(restaurantFoods.get("#123"));
		
		for (String key : keys) {
			System.out.println(restaurantFoods.get(key));
			
		}
	}

}
