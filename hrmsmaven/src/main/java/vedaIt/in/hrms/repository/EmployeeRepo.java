package vedaIt.in.hrms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vedaIt.in.hrms.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
