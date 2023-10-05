package vedaIt.in.hrms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vedaIt.in.hrms.model.StudentInvitation;
import vedaIt.in.hrms.repository.StudentInvitRepo;
import vedaIt.in.hrms.service.StudentInvitService;

import java.util.List;
@Service
public class StudentInvitImpl implements StudentInvitService {
    @Autowired
    StudentInvitRepo studentInvitRepo;

    @Override
    public StudentInvitation create(StudentInvitation studentInvitation) {
        StudentInvitation studentInvitation1 = studentInvitRepo.save(studentInvitation);
        return studentInvitation1;
    }

    @Override
    public List<StudentInvitation> getDetails() {
        List<StudentInvitation> studentInvitation1= studentInvitRepo.findAll();
        return studentInvitation1;
    }

    @Override
    public StudentInvitation updateStudent(int studId, StudentInvitation invitation) {
        StudentInvitation invitation1=studentInvitRepo.findById(studId).orElse(null);
        invitation1.setPhoneNum(invitation.getPhoneNum());
        invitation1.setEmail(invitation.getEmail());
        invitation1.setCourseName(invitation.getCourseName());
        invitation1.setFirstName(invitation.getFirstName());
        invitation1.setLastName(invitation.getLastName());
        invitation1.setCourseTime(invitation.getCourseTime());
        invitation1.setPaymentRecipt(invitation.getPaymentRecipt());
        return  studentInvitRepo.save(invitation1);
    }

    @Override
    public  void deleteById(int studId) {
        studentInvitRepo.deleteById(studId);
    }


}
