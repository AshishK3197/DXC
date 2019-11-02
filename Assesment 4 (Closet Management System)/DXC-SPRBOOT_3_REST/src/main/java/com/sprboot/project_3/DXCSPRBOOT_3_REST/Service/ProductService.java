package com.sprboot.project_3.DXCSPRBOOT_3_REST.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprboot.project_3.DXCSPRBOOT_3_REST.dao.ProductDao;
import com.sprboot.project_3.DXCSPRBOOT_3_REST.model.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao productdao;
	
	public String saveProduct(Product product) {
		
		try {
			productdao.saveProduct(product);
			return "Success";
		}
		catch (Exception e) {
			return "Error"+ e;
		}
	}
	
	public String updateProduct(Product product) {
		
		try {
			productdao.updateProduct(product);
			return "Success";
		}
		catch (Exception e) {
			return "Error" +e;
		}
	}
	
	public String deleteProduct(int productId) {
		
		try {
			productdao.deleteProduct(productId);
			return "Success";
		}
		
		catch (Exception e) {
			return "Error" + e;
		}
	}
	
	
	public Object getProduct(int productId) {
		
		try {
			return productdao.getProduct(productId);
		}
		catch (Exception e) {
			return "Error" + e;
		}
	}
	
	public ArrayList<Product> getProducts(){
		
		try {
			return productdao.getProducts();
		}
		catch (Exception e) {
			return null;
		}
	}
	

}
