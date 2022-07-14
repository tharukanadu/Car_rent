package lk.ijse.spring.service;

import lk.ijse.spring.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public void saveEmployee(Employee entity);
    public void deleteEmployee(String id);
    public void updateEmployee(Employee entity);
    public Employee searchEmployee(String id);
    public List<Employee> getAllEmployee();
}
