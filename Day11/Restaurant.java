package Collections;

import java.util.Map;

public class Restaurant {
	
	String ShowFood;
	Map<String, FoodItems>food;
	public String getShowFood() {
		return ShowFood;
	}
	public void setShowFood(String showFood) {
		this.ShowFood = showFood;
	}
	public Map<String, FoodItems> getFoods() {
		return food;
	}
	public void setFoods(Map<String, FoodItems> food) {
		this.food = food;
	}
	
}
