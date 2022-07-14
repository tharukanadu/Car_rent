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
    public void deleteEmployee(String id){repo.deleteById(id);}
    @Override
    public void updateEmployee(Employee entity){repo.save(entity);}
    @Override
    public Employee searchEmployee(String id){return repo.findById(id).get();}
    @Override
    public List<Employee> getAllEmployee(){return repo.findAll();}
}
