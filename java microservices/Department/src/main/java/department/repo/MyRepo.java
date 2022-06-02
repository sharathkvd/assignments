package department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import department.bean.Department;

@Repository
public interface MyRepo extends JpaRepository<Department, Long>{

}
