package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Office;
import lk.ijse.spring.service.CustomerServiceImpl;
import lk.ijse.spring.service.OfficeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("office")
@CrossOrigin
public class OfficeController {
    @Autowired
    OfficeServiceImpl officeService;

    @GetMapping
    public List<Office> getAllOffice(){
        return officeService.getAllOffice() ;
    }
    @PostMapping
    public void saveOffice(@ModelAttribute Office office){
        officeService.saveOffice(office);
    }

}
