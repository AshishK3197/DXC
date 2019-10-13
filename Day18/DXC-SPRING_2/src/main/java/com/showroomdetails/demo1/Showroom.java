package com.showroomdetails.demo1;

import java.util.ArrayList;

public class Showroom {
	
	String ShowName;
	ArrayList<Car> cars = new ArrayList<Car>();
	public String getShowName() {
		return ShowName;
	}
	public void setShowName(String showName) {
		ShowName = showName;
	}
	public ArrayList<Car> getCars() {
		return cars;
	}
	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	

}
