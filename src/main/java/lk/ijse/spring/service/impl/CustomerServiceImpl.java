package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper mapper;

@Override
    public void saveCustomer(CustomerDTO dto){
        if (!repo.existsById(dto.getCus_id())){
           // Customer entity = mapper.map(dto, Customer.class);
            repo.save(mapper.map(dto, Customer.class));

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
    public void updateCustomer(CustomerDTO dto){
    if(repo.existsById(dto.getCus_id())){
        repo.save(mapper.map(dto, Customer.class));

    }else{
        throw new RuntimeException("No such customer to update..!Please chek the Id ");
    }
}
    @Override
    public CustomerDTO searchCustomer(String cus_id) {
        if (repo.existsById(cus_id)) {
             return mapper.map(repo.findById(cus_id).get(), CustomerDTO.class);
        } else {
            throw new RuntimeException("No customer for "+cus_id);
        }
    }
    @Override
    public List<CustomerDTO>getAllCustomer(){
    List<Customer>all= repo.findAll();

        return mapper.map(all, new TypeToken<List<CustomerDTO>>() {
        }.getType());

    }
}
