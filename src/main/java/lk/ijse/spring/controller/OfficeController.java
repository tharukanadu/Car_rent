package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OfficeDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Office;
import lk.ijse.spring.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("office")
@CrossOrigin
public class OfficeController {
    @Autowired
    OfficeService officeService;

    @GetMapping
    public List<OfficeDTO> getAllOffice(){
        return officeService.getAllOffice() ;
    }
    @PostMapping
    public void saveOffice(@ModelAttribute OfficeDTO office){
        officeService.saveOffice(office);
    }
    @PutMapping
    public void updateOffice(@RequestBody OfficeDTO office){
        officeService.updateOffice(office);
    }
    @GetMapping(path = "/{office_id}")
    public OfficeDTO searchCustomer(@PathVariable String office_id){
        return officeService.searchOffice(office_id);
    }
}
