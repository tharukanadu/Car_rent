package lk.ijse.spring.controller;

import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.service.PaymentService;
import lk.ijse.spring.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payment")
@CrossOrigin
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllPayment(){
        return new ResponseUtil(200,"Ok",paymentService.getAllPayment());
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil savePayment(@ModelAttribute PaymentDTO payment){
        paymentService.savePayment(payment);
        return new ResponseUtil(200,"save",null);

    }
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody PaymentDTO payment){
        paymentService.updatePayment(payment);
        return new ResponseUtil(200,"Update",null);

    }
    @DeleteMapping(params = {"payment"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deletePayment(@RequestParam String payment){
        paymentService.deletePayment(payment);
        return new ResponseUtil(200,"Delete",null);
    }
    @GetMapping(path = "/{payment}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@PathVariable String payment){
        return new ResponseUtil(200,"Ok",paymentService.searchPayment(payment));
    }
}
