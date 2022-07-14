package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
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
    @PutMapping
    public void updateCustomer(@RequestBody Payment payment){
        paymentService.updatePayment(payment);
    }
    @DeleteMapping
    public void deletePayment(@RequestParam String payment){
        paymentService.deletePayment(payment);
    }
    @GetMapping(path = "/{payment}")
    public Payment searchCustomer(@PathVariable String payment){
        return paymentService.searchPayment(payment);
    }
}
