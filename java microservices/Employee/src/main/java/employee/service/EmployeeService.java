package employee.service;



import java.util.List;



import employee.bean.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	List<Employee> listOfEmployees();
	
	
	Employee updateEmployee(Employee prod,long id);
	
	
	void deleteEmployee(long id);
	

}
