package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.EmployeeDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.EmployeeRepo;
import lk.ijse.spring.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;
    @Autowired
    private ModelMapper mapper;

@Override
    public void saveEmployee(EmployeeDTO dto){
        if (!repo.existsById(dto.getEmp_id())){

            repo.save(mapper.map(dto, Employee.class));

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
    public void updateEmployee(EmployeeDTO dto){
        if(repo.existsById(dto.getEmp_id())){
            repo.save(mapper.map(dto, Employee.class));
        }else{
            throw new RuntimeException("No such employee to update..!Please chek the Id ");
        }
}
    @Override
    public EmployeeDTO searchEmployee(String emp_id){
        if (repo.existsById(emp_id)) {
            return mapper.map(repo.findById(emp_id).get(), EmployeeDTO.class);

        } else {
            throw new RuntimeException("No employee for "+emp_id);
        }
}
    @Override
    public List<EmployeeDTO> getAllEmployee(){
        List<Employee>all= repo.findAll();

        return mapper.map(all, new TypeToken<List<Employee>>() {
        }.getType());

}
}
