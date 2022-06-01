package com.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.MyDummyRepo;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	MyDummyRepo myDummyRepo;

	public Product addProduct(Product product) {

		Product addprodcut = myDummyRepo.save(product);

		return addprodcut; // returning to controler
	}

	public List<Product> listOfProducts() {

		List<Product> listOfProdcuts = myDummyRepo.findAll();// select * from tablename

		return listOfProdcuts;
	}

	public Product updateproduct(Product prod, long id) {
		prod.setId(id);

		Product updatedproduct = myDummyRepo.save(prod);

		return updatedproduct;
	}

	public void deleteproduct( long id) {

		myDummyRepo.deleteById(id);

	}



}
