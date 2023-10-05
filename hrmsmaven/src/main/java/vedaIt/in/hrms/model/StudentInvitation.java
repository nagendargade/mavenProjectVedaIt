package vedaIt.in.hrms.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StudentInvitation {
    @Id
    private int studId;
    private  String firstName;
    private String lastName;
    private String email;
    private long phoneNum;
    private String courseName;
    private String courseTime;
    private int paymentRecipt;

}
