package com.sprboot.project_3.DXCSPRBOOT_3_REST.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sprboot.project_3.DXCSPRBOOT_3_REST.model.Product;

@Component
@Transactional
public class ProductDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveProduct(Product product) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(product);	
	}
	
	
	public Product getProduct( int productId ) {
		
		Session session = sessionFactory.getCurrentSession();
		Product product = session.get(Product.class,productId);
		return product;
	}
	
	
	public String updateProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.update(product);
		return "Product Updated";
	}
	
	public  String deleteProduct(int productId) {
		Session session = sessionFactory.getCurrentSession();
		Product product1 = getProduct(productId);
		session.delete(product1);
		return "Hospital Deleted";
	}
	
	public ArrayList<Product> getProducts(){
		Session session = sessionFactory.getCurrentSession();
		ArrayList<Product> products = (ArrayList<Product>)session.createQuery("from Product").list();
		return  products;
		
	}

}
