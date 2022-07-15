package lk.ijse.spring.controller;

import lk.ijse.spring.dto.OfficeDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Office;
import lk.ijse.spring.service.OfficeService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("office")
@CrossOrigin
public class OfficeController {
    @Autowired
    OfficeService officeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllOffice(){
        return new ResponseUtil(200,"ok",officeService.getAllOffice());
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveOffice(@ModelAttribute OfficeDTO office){
        officeService.saveOffice(office);
        return new ResponseUtil(200,"save",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateOffice(@RequestBody OfficeDTO office){
        officeService.updateOffice(office);
        return new ResponseUtil(200,"Update",null);
    }
    @DeleteMapping(params = {"office_id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String office_id){
        officeService.deleteOffice(office_id);
        return new ResponseUtil(200,"Delete",null);
    }

    @GetMapping(path = "/{office_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@PathVariable String office_id){
        return new ResponseUtil(200,"save",officeService.searchOffice(office_id));

    }
}
