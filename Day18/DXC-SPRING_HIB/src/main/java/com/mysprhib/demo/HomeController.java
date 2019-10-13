package com.mysprhib.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysprhib.dao.RestaurantDao;

@Controller
public class HomeController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		
		return "Design";
	}
	
	
	@Autowired
	RestaurantDao restaurantdao;
	
	@RequestMapping(value = "/saveRestaurant")
	public String saveRestaurant(Model model,@ModelAttribute Restaurant restaurant) {
		
		model.addAttribute("rest",restaurant);
		restaurantdao.saveRestaurant(restaurant);
		
		return "Display";
	}

	
	@RequestMapping(value = "/deleteDesign")
	public String deleteRestaurant() {
				return "DeleteDesign";
	
}
	
	@RequestMapping(value = "/deleteRest")
	public String deleteRestaurant(Model model, @RequestParam("Restaurant_id") String Restaurant_id ) {
		
		int restid=Integer.parseInt(Restaurant_id);
		restaurantdao.deleteRestaurant(restid);
	
		return "Display";
	
}
	
	@RequestMapping(value = "/UpdateDesign")
	public String updateRestaurant() {
				return "UpdateDesign";
	
}
	
	  @RequestMapping(value = "/updateRest") 
	  public String updateRestaurant(Model model,@RequestParam("Restaurant_id") String Restaurant_id, @RequestParam("FoodName") String FoodName) {
	  
		  int restid = Integer.parseInt(Restaurant_id);
	  restaurantdao.updateRestaurant(restid, FoodName);
	  
	  return "Display"; 
	  }
	  
		@RequestMapping(value = "/DisplayAll")
		public String  RetreiveAll(){
					return "DisplayAll";
		
	}
	  
	  @RequestMapping(value = "/displaylist")
	  public String RetreiveAll(Model model) {
		  ArrayList<Restaurant> res = restaurantdao.getallRestaurants();
		  model.addAttribute("displayList", res);
		  return "DisplayAll";
	  }
	  
}


