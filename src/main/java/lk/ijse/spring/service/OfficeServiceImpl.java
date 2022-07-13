/*
package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Office;
import lk.ijse.spring.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class OfficeServiceImpl {
    @Autowired
    private CustomerRepo repo;

    public void saveOffice(Office entity){}
    public void deleteOffice(String id){repo.deleteById(id);}
    public void updateOffice(Office entity){repo.save(entity);}
    public Customer searchOffice(String id){return repo.findById(id).get();}
    public List<Customer> getAllOffice(){return repo.findAll();}
}
*/
