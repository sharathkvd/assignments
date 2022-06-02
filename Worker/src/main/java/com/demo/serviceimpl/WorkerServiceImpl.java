package com.demo.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.demo.controller.WorkerController;
import com.demo.entity.Worker;
import com.demo.repository.MyDummyRepo;

import com.demo.service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
	 private static final Logger log = LoggerFactory.getLogger(WorkerController.class);

	@Autowired
	MyDummyRepo myDummyRepo;

	public Worker addWorker(Worker product) {
		log.info("in service");

		Worker addprodcut = myDummyRepo.save(product);

		return addprodcut; // returning to controler
	}

	public List<Worker> listOfWorkers() {

		List<Worker> listOfProdcuts = myDummyRepo.findAll();// select * from tablename

		return listOfProdcuts;
	}

	public Worker updateworker(Worker prod, long id) {
		prod.setId(id);

		Worker updatedproduct = myDummyRepo.save(prod);

		return updatedproduct;
	}

	public void deleteworker( long id) {

		myDummyRepo.deleteById(id);

	}

	



}
