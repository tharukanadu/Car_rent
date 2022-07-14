package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.service.CustomerServiceImpl;
import lk.ijse.spring.service.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payment")
@CrossOrigin
public class PaymentController {
    @Autowired
    PaymentServiceImpl paymentService;

    @GetMapping
    public List<Payment> getAllPayment(){
        return paymentService.getAllPayment() ;
    }
    @PostMapping
    public void savePayment(@ModelAttribute Payment payment){
        paymentService.savePayment(payment);
    }

}
