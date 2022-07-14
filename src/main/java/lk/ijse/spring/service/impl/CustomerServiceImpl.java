package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;
@Override
    public void saveCustomer(Customer entity){
        if (!repo.existsById(entity.getCus_id())){
            repo.save(entity);
        repo.save(entity);
        }else {
            throw new RuntimeException("Customer Already Exits..!");
        }
        }
    @Override
    public void deleteCustomer(String cus_id){
    if(repo.existsById(cus_id)) {
        repo.deleteById(cus_id);
    }else{
        throw new RuntimeException("Please chek the customer Id..! No search customer");
    }
}
    @Override
    public void updateCustomer(Customer entity){
    if(repo.existsById(entity.getCus_id())){
        repo.save(entity);
    }else{
        throw new RuntimeException("No such customer to update..!Please chek the Id ");
    }
}
    @Override
    public Customer searchCustomer(String cus_id) {
        if (repo.existsById(cus_id)) {
            return repo.findById(cus_id).get();
        } else {
            throw new RuntimeException("No customer for "+cus_id);
        }
    }
    @Override
    public List<Customer>getAllCustomer(){return repo.findAll();}
}
