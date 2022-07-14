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
    public void deletePayment(String id){repo.deleteById(id);}
    @Override
    public void updatePayment(Payment entity){repo.save(entity);}
    @Override
    public Payment searchPayment(String id){return repo.findById(id).get();}
    @Override
    public List<Payment> getAllPayment(){return repo.findAll();}
}
