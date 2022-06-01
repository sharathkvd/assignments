package com.demo.service;

import java.util.List;

import com.demo.entity.Product;

public interface ProductService {
	
	// service give by admin insest
	Product addProduct(Product product);
	
	//get list of products from db
	
	List<Product> listOfProducts();
	
	//update products
	Product updateproduct(Product prod,long id);
	
	//getProductbyId()  assingment
	
	//deleteproductById()  assingment
	
	
	//deletAllProduct()  assingment
	
	void deleteproduct(long id);
	
	
	

}