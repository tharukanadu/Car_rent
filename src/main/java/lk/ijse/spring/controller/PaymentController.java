package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payment")
@CrossOrigin
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayment(){
        return paymentService.getAllPayment() ;
    }
    @PostMapping
    public void savePayment(@ModelAttribute Payment payment){
        paymentService.savePayment(payment);
    }

}
