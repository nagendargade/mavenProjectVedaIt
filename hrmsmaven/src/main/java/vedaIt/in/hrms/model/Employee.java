package vedaIt.in.hrms.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {
    @Id
    private int id;
    private String empName;
    private String email;
    private int phoneNumber;
    private Date JoiningDate;
    private String TeachingCourse;
    private String role;
    private String Supervisor;
}
