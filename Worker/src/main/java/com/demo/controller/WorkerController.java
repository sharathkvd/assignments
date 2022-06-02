package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Worker;

import com.demo.service.WorkerService;

@RestController
@RequestMapping("/api/")

public class 	WorkerController {
	
	private static final Logger log = LoggerFactory.getLogger(WorkerController.class);

	@Autowired
	WorkerService productService;

	// create service for admin
	@PostMapping(value ="/createWorker") // endpoint
	Worker createWorker(@Valid @RequestBody Worker prod) {

		log.info(" ******** in WorkerController class**** "+prod.getName());
		log.info(" ******** in WorkerController class**** "+prod.getAddress());

		Worker p = productService.addWorker(prod);// calling service from controller
		log.info(" ******** in after called service class**** ");
		return p;

	}

	// api
	// get method
	@GetMapping(value = "/listofproducts")
	List<Worker> listOfWorkers() {

		List<Worker> listofprod = productService.listOfWorkers();

		return listofprod;

	}

	@PutMapping(value = "/updateproduct/{id}")
	Worker udateProduct(@RequestBody Worker prod, @PathVariable long id) {

		productService.updateworker(prod, id);
		return prod;

	}
	
	
	@DeleteMapping(value = "/deleteproduct/{id}")
	String deleteWorkerById(@PathVariable Long id) {
	
		productService.deleteworker(id);
		
		return "deleted record "+id;
		
		
		
	}
	

}
