package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Contact;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.ContactRepo;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepo repo;
    @Override
    public void saveContact(Contact entity){
        if (!repo.existsById(entity.getCont_id())){
            repo.save(entity);

        }else {
            throw new RuntimeException("Contact Already Exits..!");
        }
    }
    @Override
    public void deleteContact(String cont_id){
        if(repo.existsById(cont_id)) {
            repo.deleteById(cont_id);
        }else{
            throw new RuntimeException("Please chek the contact Id..! No search contact");
        }
    }
    @Override
    public void updateContact(Contact entity){
        if(repo.existsById(entity.getCont_id())){
            repo.save(entity);
        }else{
            throw new RuntimeException("No such contact to update..!Please chek the Id ");
        }
    }
    @Override
    public Contact searchContact(String cont_id){
        if (repo.existsById(cont_id)) {
            return repo.findById(cont_id).get();
        } else {
            throw new RuntimeException("No contact for "+cont_id);
        }
    }
    @Override
    public List<Contact> getAllContact(){return repo.findAll();}

}
