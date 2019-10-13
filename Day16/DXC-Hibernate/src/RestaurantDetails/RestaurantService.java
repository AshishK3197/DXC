package RestaurantDetails;

import java.util.ArrayList;

public class RestaurantService {

	public static void main(String[] args) {
		
//		Restaurant res = new Restaurant();
//		res.setFoodId(001);
//		res.setFoodName("Mutter Paneer");
//		res.setPrice(500);
		
		RestaurantDao dao = new RestaurantDao();
		//dao.saveRestaurantInfo(res);
		
		
	dao.updateRestaurantInfo(101, "xyz");
	//dao.deleteRestaurantInfo(1);
//		
		
//		ArrayList<Restaurant> restaurantList= dao.getallRestaurants();
//		
//		for(Restaurant restaurant1 :restaurantList)
//		{
//		System.out.println(restaurant1.getFoodName());
//		
//		}
//
//		System.out.println("DONE");
//		
		
		

	}

}
