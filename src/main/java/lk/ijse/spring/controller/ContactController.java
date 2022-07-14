package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Contact;
import lk.ijse.spring.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contact")
@CrossOrigin
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping
    public List<Contact> getAllContact(){
        return contactService.getAllContact() ;
    }
    @PostMapping
    public void saveInsurance(@ModelAttribute Contact contact){
        contactService.saveContact(contact);
    }
}
