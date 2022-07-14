package lk.ijse.spring.service;

import lk.ijse.spring.entity.Contact;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.ContactRepo;
import lk.ijse.spring.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ContactServiceImpl {
    @Autowired
    private ContactRepo repo;

    public void saveContact(Contact entity){
        if (!repo.existsById(entity.getCont_id())){
            repo.save(entity);

        }else {
            throw new RuntimeException("Contact Already Exits..!");
        }
    }
    public void deleteContact(String id){repo.deleteById(id);}
    public void updateContact(Contact entity){repo.save(entity);}
    public Contact searchContact(String id){return repo.findById(id).get();}
    public List<Contact> getAllContact(){return repo.findAll();}

}
