package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ContactDTO;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Contact;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.ContactRepo;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.ContactService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveContact(ContactDTO dto){
        if (!repo.existsById(dto.getCont_id())){
            repo.save(mapper.map(dto, Contact.class));

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
    public void updateContact(ContactDTO dto){
        if(repo.existsById(dto.getCont_id())){
            repo.save(mapper.map(dto, Contact.class));
        }else{
            throw new RuntimeException("No such contact to update..!Please chek the Id ");
        }
    }
    @Override
    public ContactDTO searchContact(String cont_id){
        if (repo.existsById(cont_id)) {
            return mapper.map(repo.findById(cont_id).get(), ContactDTO.class);

        } else {
            throw new RuntimeException("No contact for "+cont_id);
        }
    }
    @Override
    public List<ContactDTO> getAllContact(){
        List<Contact>all= repo.findAll();
        return mapper.map(all, new TypeToken<List<Contact>>() {
        }.getType());

    }

}
