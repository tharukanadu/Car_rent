package lk.ijse.spring.controller;

import lk.ijse.spring.dto.InsuranceDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.entity.Insurance;
import lk.ijse.spring.service.InsuranceService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("insurance")
@CrossOrigin
public class InsuranceController {
    @Autowired
    InsuranceService insuranceService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomer(){
        return new ResponseUtil(200,"ok",insuranceService.getAllInsurance());
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveInsurance(@ModelAttribute InsuranceDTO insurance){
        insuranceService.saveInsurance(insurance);
        return new ResponseUtil(200,"save",null);
    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateInsurance(@RequestBody InsuranceDTO insurance){
        insuranceService.updateInsurance(insurance);
        return new ResponseUtil(200,"update",null);

    }
    @DeleteMapping(params = {"insurance_id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteInsurance(@RequestParam String insurance_id){
        insuranceService.deleteInsurance(insurance_id);
        return new ResponseUtil(200,"delete",null);

    }
    @GetMapping(path = "/{insurance_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@PathVariable String insurance_id){
        return new ResponseUtil(200,"ok",insuranceService.searchInsurance(insurance_id));
    }
}
