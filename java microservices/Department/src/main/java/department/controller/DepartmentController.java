package department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import department.service.DepartmentService;
import department.bean.Department;

public class DepartmentController {
	
	@Autowired
	DepartmentService departmentservice;
	
	// create service for admin
		@PostMapping(value = "/createemployee") // endpoint
		Department createEmployee(@RequestBody Department prod) {
			
			
			
		
			
			Department p = departmentservice.adddepartment(prod);// calling service from controller
			return p;

		}

		// api
		// get method
		@GetMapping(value = "/listofdepartment")
		List<Department> listOfEmployes() {

			List<Department> listofemployee = departmentservice.listOfDepartment();

			return listofemployee ;

		}

		@PutMapping(value = "/updatedepartment/{id}")
		Department udateProduct(@RequestBody Department empl, @PathVariable long id) {

			departmentservice.updatedepartment(empl, id);
			return empl;

		}
		
		
		@DeleteMapping(value = "/deletedepartment/{id}")
		String deleteProductById(@PathVariable Long id) {
		
			departmentservice.deletedepartment(id);
			
			return "deleted record "+id;
			
			
			
		}

}
