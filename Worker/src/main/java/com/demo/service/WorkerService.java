

package com.demo.service;

import java.util.List;


import com.demo.entity.Worker;

public interface WorkerService {
	
	// service give by admin insest
	Worker addWorker(Worker worker);
	
	//get list of products from db
	
	List<Worker> listOfWorkers();
	
	//update products
	Worker updateworker(Worker prod,long id);
	
	//getProductbyId()  assingment
	
	//deleteproductById()  assingment
	
	
	//deletAllProduct()  assingment
	
	void deleteworker(long id);
}