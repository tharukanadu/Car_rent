package lk.ijse.spring.controller;

import lk.ijse.spring.dto.EmployeeDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> getAllEmployee(){
        return employeeService.getAllEmployee() ;
    }
    @PostMapping
    public void saveEmployee(@ModelAttribute EmployeeDTO employee){
        employeeService.saveEmployee(employee);
    }
    @PutMapping
    public void updateEmployee (@RequestBody EmployeeDTO employee){
        employeeService.updateEmployee(employee);
    }
    @DeleteMapping
    public void deleteEmployee(@RequestParam String emp_id){
        employeeService.deleteEmployee(emp_id);
    }
    @GetMapping(path = "/{emp_id}")
    public EmployeeDTO searchEmployee(@PathVariable String emp_id){
        return employeeService.searchEmployee(emp_id);
    }
}
