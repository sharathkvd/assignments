package department.service;

import java.util.List;

import department.bean.Department;

public interface DepartmentService {
	
	Department adddepartment(Department department);
	
	List<Department> listOfDepartment();
	
	
	Department updatedepartment(Department prod,long id);
	
	
	
	void deletedepartment(long id);
	


}
