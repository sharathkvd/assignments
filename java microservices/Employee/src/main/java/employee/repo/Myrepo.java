package employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employee.bean.Employee;


@Repository
public interface Myrepo extends JpaRepository<Employee, Long> {

}
