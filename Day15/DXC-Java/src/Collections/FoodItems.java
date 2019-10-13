package Collections;

public class FoodItems {
	String Foodid;
	String FoodName;
	public String getFoodid() {
		return Foodid;
	}
	public void setFoodid(String foodid) {
		this.Foodid = foodid;
	}
	public String getFoodName() {
		return FoodName;
	}
	public void setFoodName(String foodName) {
		this.FoodName = foodName;
	}
	public FoodItems(String foodid, String foodName) {
		super();
		this.Foodid = foodid;
		this.FoodName = foodName;
	}
	
	@Override
	public String toString() {
		return getFoodid() +" "+ getFoodName();
	}

}
