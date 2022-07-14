package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerServiceImpl;
import lk.ijse.spring.service.InsuranceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("insurance")
@CrossOrigin
public class InsuranceController {
    @Autowired
    InsuranceServiceImpl insuranceService;

    @GetMapping
    public List<lk.ijse.spring.entity.Insurance> getAllCustomer(){
        return insuranceService.getAllInsurance() ;
    }
    @PostMapping
    public void saveInsurance(@ModelAttribute lk.ijse.spring.entity.Insurance insurance){
        insuranceService.saveInsurance(insurance);
    }

}
