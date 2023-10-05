package vedaIt.in.hrms.service;



import vedaIt.in.hrms.model.StudentInvitation;

import java.util.List;

public interface StudentInvitService {
    StudentInvitation create(StudentInvitation studentInvitation);
    List<StudentInvitation> getDetails ();
    StudentInvitation updateStudent(int studId, StudentInvitation invitation);
    void deleteById(int studId);
}
