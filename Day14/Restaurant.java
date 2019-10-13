package Collections;

import java.util.Map;

public class Restaurant {
	
	String name;
	Map<String, FoodItems>food;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, FoodItems> getFood() {
		return food;
	}
	public void setFood(Map<String, FoodItems> food) {
		this.food = food;
	}
	
}
