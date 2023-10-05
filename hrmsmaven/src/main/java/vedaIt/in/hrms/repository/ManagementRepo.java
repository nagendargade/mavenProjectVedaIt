package vedaIt.in.hrms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vedaIt.in.hrms.model.Management;

public interface ManagementRepo extends JpaRepository<Management, Integer> {
}
