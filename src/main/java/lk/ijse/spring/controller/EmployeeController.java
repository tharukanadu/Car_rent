package lk.ijse.spring.controller;

import lk.ijse.spring.dto.EmployeeDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.service.EmployeeService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllEmployee(){
        return new ResponseUtil(200,"ok", employeeService.getAllEmployee());
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveEmployee(@ModelAttribute EmployeeDTO employee){
        employeeService.saveEmployee(employee);
        return new ResponseUtil(200,"save",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateEmployee (@RequestBody EmployeeDTO employee){
        employeeService.updateEmployee(employee);
        return new ResponseUtil(200,"Update",null);
    }
    @DeleteMapping(params = {"emp_id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteEmployee(@RequestParam String emp_id){
        employeeService.deleteEmployee(emp_id);
        return new ResponseUtil(200,"Delete",null);
    }
    @GetMapping(path = "/{emp_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchEmployee(@PathVariable String emp_id){
        return new ResponseUtil(200,"ok",employeeService.searchEmployee(emp_id));
    }
}
