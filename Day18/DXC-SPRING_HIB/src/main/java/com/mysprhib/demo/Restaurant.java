package com.mysprhib.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	@Id
	int Restaurant_id;
	String Restaurant_name;
	String FoodName;
	float Price;
	public int getRestaurant_id() {
		return Restaurant_id;
	}
	public void setRestaurant_id(int restaurant_id) {
		Restaurant_id = restaurant_id;
	}
	public String getRestaurant_name() {
		return Restaurant_name;
	}
	public void setRestaurant_name(String restaurant_name) {
		Restaurant_name = restaurant_name;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	

}
