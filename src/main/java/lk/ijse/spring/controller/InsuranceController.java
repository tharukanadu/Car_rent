package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.entity.Insurance;
import lk.ijse.spring.service.InsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("insurance")
@CrossOrigin
public class InsuranceController {
    @Autowired
    InsuranceService insuranceService;

    @GetMapping
    public List<lk.ijse.spring.entity.Insurance> getAllCustomer(){
        return insuranceService.getAllInsurance() ;
    }
    @PostMapping
    public void saveInsurance(@ModelAttribute lk.ijse.spring.entity.Insurance insurance){
        insuranceService.saveInsurance(insurance);
    }
    @PutMapping
    public void updateInsurance(@RequestBody Insurance insurance){
        insuranceService.updateInsurance(insurance);
    }
    @DeleteMapping
    public void deleteInsurance(@RequestParam String insurance_id){
        insuranceService.deleteInsurance(insurance_id);
    }
    @GetMapping(path = "/{insurance_id}")
    public Insurance searchCustomer(@PathVariable String insurance_id){
        return insuranceService.searchInsurance(insurance_id);
    }
}
