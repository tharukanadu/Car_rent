package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl {
    @Autowired
    private PaymentRepo repo;

    public void savePayment(Payment entity){
        if (!repo.existsById(entity.getCus_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Payment Already Exits..!");
        }
    }
    public void deletePayment(String id){repo.deleteById(id);}
    public void updatePayment(Payment entity){repo.save(entity);}
    public Payment searchPayment(String id){return repo.findById(id).get();}
    public List<Payment> getAllPayment(){return repo.findAll();}
}
