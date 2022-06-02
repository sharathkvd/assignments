package department.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import department.bean.Department;
import department.repo.MyRepo;
import department.service.DepartmentService;

@Service

public class MyDepartmentServiceimpl implements DepartmentService {
	
	@Autowired
	MyRepo myrepo;

	@Override
	public Department adddepartment(Department department) {
		Department addDepartment = myrepo.save(department);

		return addDepartment; // returning to controler
	}

	@Override
	public List<Department> listOfDepartment() {
		List<Department> listOfdepartment = myrepo.findAll();// select * from tablename

		return listOfdepartment;
	}

	@Override
	public Department updatedepartment(Department prod, long id) {
		prod.setId(id);

		Department updatedDepartment = myrepo.save(prod);

		return updatedDepartment;
	}

	@Override
	public void deletedepartment(long id) {
		myrepo.deleteById(id);
		
	}

}
