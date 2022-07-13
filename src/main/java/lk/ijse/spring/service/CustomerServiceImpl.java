package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CustomerServiceImpl {

    @Autowired
    private CustomerRepo repo;

    public void saveCustomer(Customer entity){
        if (!repo.existsById(entity.getCus_id())){
            repo.save(entity);
        repo.save(entity);
        }else {
            throw new RuntimeException("Customer Already Exits..!");
        }
        }
    public void deleteCustomer(String id){repo.deleteById(id);}
    public void updateCustomer(Customer entity){repo.save(entity);}
    public Customer searchCustomer(String id){return repo.findById(id).get();}
    public List<Customer>getAllCustomer(){return repo.findAll();}
}
