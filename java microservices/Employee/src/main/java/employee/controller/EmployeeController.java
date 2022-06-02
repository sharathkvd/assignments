package employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import employee.bean.Employee;
import employee.service.EmployeeService;



public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;

	// create service for admin
	@PostMapping(value = "/createemployee") // endpoint
	Employee createEmployee(@RequestBody Employee prod) {
		
		
		
	
		
		Employee p = employeeService.addEmployee(prod);// calling service from controller
		return p;

	}

	// api
	// get method
	@GetMapping(value = "/listofemployees")
	List<Employee> listOfEmployes() {

		List<Employee> listofemployee = employeeService.listOfEmployees();

		return listofemployee ;

	}

	@PutMapping(value = "/updateproduct/{id}")
	Employee udateProduct(@RequestBody Employee empl, @PathVariable long id) {

		employeeService.updateEmployee(empl, id);
		return empl;

	}
	
	
	@DeleteMapping(value = "/deleteproduct/{id}")
	String deleteProductById(@PathVariable Long id) {
	
		employeeService.deleteEmployee(id);
		
		return "deleted record "+id;
		
		
		
	}
	


}
