package vedaIt.in.hrms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vedaIt.in.hrms.model.Employee;
import vedaIt.in.hrms.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class EmployeeControl {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/AddEmployee")
    public ResponseEntity<Employee> create(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.createEmp(employee), HttpStatus.CREATED);
    }

    @GetMapping("/getEmployeeDetails")
    public ResponseEntity<List<Employee>> getAll(){
        return  new ResponseEntity<>(employeeService.getEmploeeyDetails(),HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> update(@RequestBody Employee  employee,@PathVariable int id){
        return new ResponseEntity<>(employeeService.updateStudent(id, employee),HttpStatus.CREATED);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Employee> delete(@PathVariable int id){
        employeeService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
