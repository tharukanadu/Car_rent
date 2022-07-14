package lk.ijse.spring.service.impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.PaymentRepo;
import lk.ijse.spring.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo repo;

    @Override
    public void savePayment(Payment entity){
        if (!repo.existsById(entity.getCus_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Payment Already Exits..!");
        }
    }
    @Override
    public void deletePayment(String payment){
        if(repo.existsById(payment)) {
            repo.deleteById(payment);
        }else{
            throw new RuntimeException("Please chek the payment Id..! No search payment");
        }
    }
    @Override
    public void updatePayment(Payment entity){
        if(repo.existsById(entity.getPayment())){
            repo.save(entity);
        }else{
            throw new RuntimeException("No such payment to update..!Please chek the Id ");
        }
    }
    @Override
    public Payment searchPayment(String payment){
        if (repo.existsById(payment)) {
            return repo.findById(payment).get();
        } else {
            throw new RuntimeException("No payment for "+payment);
        }
    }
    @Override
    public List<Payment> getAllPayment(){return repo.findAll();}
}
