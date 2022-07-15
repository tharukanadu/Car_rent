package lk.ijse.spring.service;

import lk.ijse.spring.dto.ContactDTO;
import lk.ijse.spring.entity.Contact;

import java.util.List;

public interface ContactService {
    public void saveContact(ContactDTO dto);
    public void deleteContact(String id);
    public void updateContact(ContactDTO dto);
    public ContactDTO searchContact(String id);
    public List<ContactDTO> getAllContact();

}
