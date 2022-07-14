package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl {

    @Autowired
    private EmployeeRepo repo;

    public void saveEmployee(Employee entity){
        if (!repo.existsById(entity.getEmp_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Employee Already Exits..!");
        }
    }
    public void deleteEmployee(String id){repo.deleteById(id);}
    public void updateEmployee(Employee entity){repo.save(entity);}
    public Employee searchEmployee(String id){return repo.findById(id).get();}
    public List<Employee> getAllEmployee(){return repo.findAll();}
}
