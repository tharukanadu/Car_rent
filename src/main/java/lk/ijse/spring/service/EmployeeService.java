package lk.ijse.spring.service;

import lk.ijse.spring.dto.EmployeeDTO;
import lk.ijse.spring.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public void saveEmployee(EmployeeDTO dto);
    public void deleteEmployee(String id);
    public void updateEmployee(EmployeeDTO dto);
    public EmployeeDTO searchEmployee(String id);
    public List<EmployeeDTO> getAllEmployee();
}
