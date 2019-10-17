package com.mysprhib.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysprhib.demo.Restaurant;

@Component
public class RestaurantDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Transactional
	public void saveRestaurant(Restaurant restaurant) {
		
		Session session  = sessionFactory.getCurrentSession();
		session.save(restaurant);
		
	}
	
	@Transactional
	public void deleteRestaurant(int Restaurant_id) {
		
		Session session  = sessionFactory.getCurrentSession();
	Restaurant rest=new Restaurant();
	rest.setRestaurant_id(Restaurant_id);
		session.delete(rest);
		
	}
	@Transactional
	public void updateRestaurant(int Restaurant_id,String FoodName) {
		
		Session session  = sessionFactory.getCurrentSession();
		Object o=session.load(Restaurant.class, Restaurant_id);
		Restaurant rest1 = new Restaurant();
		rest1.setFoodName(FoodName);
		rest1.setRestaurant_id(Restaurant_id);
		session.update(rest1);
		
	}
	
	@Transactional
	public ArrayList<Restaurant> getallRestaurants(){
		Session session  = sessionFactory.getCurrentSession();
		ArrayList<Restaurant> res  = (ArrayList<Restaurant>)session.createQuery("from Restaurant").list();
		return res;
		
	}
	
	@Transactional
	public Restaurant getListbyId(int Restaurant_id) {
		Session session  = sessionFactory.getCurrentSession();
		Restaurant rlist  = (Restaurant)session.get(Restaurant.class,Restaurant_id);
		return rlist;
	}
}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	

