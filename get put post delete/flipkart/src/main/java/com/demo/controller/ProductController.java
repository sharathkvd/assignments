package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.entity.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	// create service for admin
	@PostMapping(value = "/createproduct") // endpoint
	Product createProduct(@RequestBody Product prod) {
		Product p = productService.addProduct(prod);// calling service from controller
		return p;

	}

	// api
	// get method
	@GetMapping(value = "/listofproducts")
	List<Product> listOfProducts() {

		List<Product> listofprod = productService.listOfProducts();

		return listofprod;

	}

	@PutMapping(value = "/updateproduct/{id}")
	Product udateProduct(@RequestBody Product prod, @PathVariable long id) {

		productService.updateproduct(prod, id);
		return prod;

	}
	
	
	@DeleteMapping(value = "/deleteproduct/{id}")
	String deleteProductById(@PathVariable Long id) {
	
		productService.deleteproduct(id);
		
		return "deleted record "+id;
		
		
		
	}
	

}
