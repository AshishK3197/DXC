package RestaurantDetails;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RestaurantDao {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	public void saveRestaurantInfo(Restaurant restaurant) {
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(restaurant);
		tx.commit();
	}
	
	
	public void updateRestaurantInfo(int FoodId,String FoodName) {
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		Restaurant restaurant1 = new Restaurant();
		restaurant1.setFoodId(101);
		restaurant1.setFoodName("abc");
		session.saveOrUpdate(restaurant1);
		tx.commit();
		session.close();
	}
	
	
	public void deleteRestaurantInfo(int FoodId) {
		Session session=factory.openSession();
		Restaurant restaurant1 = session.get(Restaurant.class, FoodId);
		Transaction tx= session.beginTransaction();
		session.delete(restaurant1);
		tx.commit();
		session.close();
		
	}
	
	
	public ArrayList<Restaurant> getallRestaurants(){
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		ArrayList<Restaurant>restaurants =  (ArrayList<Restaurant>)session.createQuery("from Restaurant").list();
		return restaurants;
	}

}
