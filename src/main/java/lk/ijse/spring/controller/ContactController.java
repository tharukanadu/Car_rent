package lk.ijse.spring.controller;

import lk.ijse.spring.dto.ContactDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.entity.Contact;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.ContactService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contact")
@CrossOrigin
public class ContactController {
    @Autowired
    ContactService contactService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllContact(){
        return new ResponseUtil(200,"Ok", contactService.getAllContact());

    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveContact(@ModelAttribute ContactDTO contact){
        contactService.saveContact(contact);
        return new ResponseUtil(200,"Save",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateContact(@RequestBody ContactDTO contact){
        contactService.updateContact(contact);
        return new ResponseUtil(200,"Update",null);

    }
    @DeleteMapping(params = {"cont_id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteContact(@RequestParam String cont_id){
        contactService.deleteContact(cont_id);
        return new ResponseUtil(200,"ok",null);
    }
    @GetMapping(path = "/{cont_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchContact(@PathVariable String cont_id){
        return new ResponseUtil(200,"ok",contactService.searchContact(cont_id));

    }
}
