package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;

import java.util.List;

public interface CustomerService {

    public void saveCustomer(Customer entity);
    public void deleteCustomer(String id);
    public void updateCustomer(Customer entity);
    public Customer searchCustomer(String id);
    public List<Customer> getAllCustomer();
}
