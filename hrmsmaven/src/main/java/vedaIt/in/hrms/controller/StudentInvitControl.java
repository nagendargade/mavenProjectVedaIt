package vedaIt.in.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vedaIt.in.hrms.model.StudentInvitation;
import vedaIt.in.hrms.service.StudentInvitService;

import java.util.List;

@RestController
@RequestMapping("/StudentInvitation")

public class StudentInvitControl {

    @Autowired
    StudentInvitService studentInvitService;

    @PostMapping("/StudentInv")
    public ResponseEntity<StudentInvitation> create(@RequestBody StudentInvitation  studentInvitation){
        return new ResponseEntity<>(studentInvitService.create(studentInvitation), HttpStatus.CREATED);
    }

    @GetMapping("/getStudentDetails")
    public ResponseEntity<List<StudentInvitation>> getAll(){
    return  new ResponseEntity<>(studentInvitService.getDetails(),HttpStatus.OK);
    }
    @PutMapping("/update/{studId}")
    public ResponseEntity<StudentInvitation> update(@RequestBody StudentInvitation  studentInvitation,@PathVariable int studId){
        return new ResponseEntity<>(studentInvitService.updateStudent(studId,studentInvitation),HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{studId}")
    public ResponseEntity<StudentInvitation> delete(@PathVariable int studId){
        studentInvitService.deleteById(studId);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }



}
