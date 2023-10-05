package vedaIt.in.hrms.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vedaIt.in.hrms.model.Employee;
import vedaIt.in.hrms.repository.EmployeeRepo;
import vedaIt.in.hrms.service.EmployeeService;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public Employee createEmp(Employee employee) {
        Employee employee1=employeeRepo.save(employee);
        return employee1;
    }

    @Override
    public List<Employee> getEmploeeyDetails() {
        List<Employee> employee=employeeRepo.findAll();
        return employee;
    }

    @Override
    public Employee updateStudent(int id, Employee employee) {
        Employee employee1=employeeRepo.findById(id).orElse(null);
        employee1.setEmail(employee.getEmail());
        employee1.setRole(employee.getRole());
        employee1.setEmpName(employee.getEmpName());
        employee1.setTeachingCourse(employee.getTeachingCourse());

        return employee1;
    }

    @Override
    public void deleteById(int id) {
        employeeRepo.deleteById(id);


    }
}
