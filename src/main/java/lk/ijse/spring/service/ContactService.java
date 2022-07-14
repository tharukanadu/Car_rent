package lk.ijse.spring.service;

import lk.ijse.spring.entity.Contact;

import java.util.List;

public interface ContactService {
    public void saveContact(Contact entity);
    public void deleteContact(String id);
    public void updateContact(Contact entity);
    public Contact searchContact(String id);
    public List<Contact> getAllContact();

}
