package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.service.CustomerServiceImpl;
import lk.ijse.spring.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee() ;
    }
    @PostMapping
    public void saveEmployee(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
    }

}
