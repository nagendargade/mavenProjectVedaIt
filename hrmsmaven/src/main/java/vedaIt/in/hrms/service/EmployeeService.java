package vedaIt.in.hrms.service;


import vedaIt.in.hrms.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmp (Employee employee);
    List<Employee> getEmploeeyDetails ();

    Employee updateStudent(int id, Employee employee);
    void deleteById(int id);

}
