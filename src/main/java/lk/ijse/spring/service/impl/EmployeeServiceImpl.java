package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.EmployeeRepo;
import lk.ijse.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;
@Override
    public void saveEmployee(Employee entity){
        if (!repo.existsById(entity.getEmp_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Employee Already Exits..!");
        }
    }
    @Override
    public void deleteEmployee(String emp_id){
        if(repo.existsById(emp_id)) {
            repo.deleteById(emp_id);
        }else{
            throw new RuntimeException("Please chek the employee Id..! No search employee");
        }
}
    @Override
    public void updateEmployee(Employee entity){
        if(repo.existsById(entity.getEmp_id())){
            repo.save(entity);
        }else{
            throw new RuntimeException("No such employee to update..!Please chek the Id ");
        }
}
    @Override
    public Employee searchEmployee(String emp_id){
        if (repo.existsById(emp_id)) {
            return repo.findById(emp_id).get();
        } else {
            throw new RuntimeException("No employee for "+emp_id);
        }
}
    @Override
    public List<Employee> getAllEmployee(){return repo.findAll();}
}
