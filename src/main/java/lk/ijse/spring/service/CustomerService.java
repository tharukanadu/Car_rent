package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    public void saveCustomer(CustomerDTO dto);
    public void deleteCustomer(String id);
    public void updateCustomer(CustomerDTO dto);
    public CustomerDTO searchCustomer(String id);
    public List<CustomerDTO> getAllCustomer();
}
