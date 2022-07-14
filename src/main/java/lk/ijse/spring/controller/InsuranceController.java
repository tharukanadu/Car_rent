package lk.ijse.spring.controller;

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

}
