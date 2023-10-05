package vedaIt.in.hrms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import vedaIt.in.hrms.model.StudentInvitation;

public interface StudentInvitRepo extends JpaRepository<StudentInvitation, Integer> {

}
