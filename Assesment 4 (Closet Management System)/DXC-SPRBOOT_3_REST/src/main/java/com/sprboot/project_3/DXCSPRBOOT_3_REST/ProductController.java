package com.sprboot.project_3.DXCSPRBOOT_3_REST;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sprboot.project_3.DXCSPRBOOT_3_REST.Service.ProductService;
import com.sprboot.project_3.DXCSPRBOOT_3_REST.model.Product;


@CrossOrigin
@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;

	
	 @PostMapping(value = "/product") 
	 public String saveProduct(@RequestBody Product product) {
		 
		 return productservice.saveProduct(product); 
		 }
		 
		
		@GetMapping(value = "/product")
		public ArrayList<Product> getAllHospitals(){
			
			return productservice.getProducts();
		}
			
		@GetMapping(value = "/product/{productId}")
		public Object getProduct(@PathVariable int productId) {
			
			return productservice.getProduct(productId);
		}
		
		@DeleteMapping(value = "/product/{productId}")
		public String deleteProduct(@PathVariable int productId) {
			
			return productservice.deleteProduct(productId);
		}
		
		@PutMapping(value = "/product")
		public String updateHospital(@RequestBody Product product) {
			
			return productservice.updateProduct(product);
		}
}
