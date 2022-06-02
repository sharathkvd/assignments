package employee.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import employee.bean.Employee;
import employee.repo.Myrepo;
import employee.service.EmployeeService;


@Service
public class MyEmployeeServiceimpl implements EmployeeService{
	
	@Autowired
	Myrepo myrepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee addemployee = myrepo.save(employee);

		return addemployee; // returning to controler
	}

	@Override
	public List<Employee> listOfEmployees() {
		List<Employee> listOfemployee = myrepo.findAll();// select * from tablename

		return listOfemployee;
	}

	@Override
	public Employee updateEmployee(Employee prod, long id) {
		prod.setId(id);

		Employee updatedemployee = myrepo.save(prod);

		return updatedemployee;
	}

	@Override
	public void deleteEmployee(long id) {
		myrepo.deleteById(id);
		
	}

}
