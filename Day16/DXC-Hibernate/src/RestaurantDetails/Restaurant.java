package RestaurantDetails;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Restaurant {
	
	
	String FoodName;
	int Price;
	@Id
	int FoodId;
	public int getFoodId() {
		return FoodId;
	}
	public void setFoodId(int foodId) {
		FoodId = foodId;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		FoodName = foodName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}


}
