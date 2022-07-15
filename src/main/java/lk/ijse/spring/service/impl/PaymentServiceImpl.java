package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.PaymentDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.PaymentRepo;
import lk.ijse.spring.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void savePayment(PaymentDTO dto){
        if (!repo.existsById(dto.getCus_id())){
            repo.save(mapper.map(dto, Payment.class));

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
    public void updatePayment(PaymentDTO dto){
        if(repo.existsById(dto.getPayment())){
            repo.save(mapper.map(dto, Payment.class));
        }else{
            throw new RuntimeException("No such payment to update..!Please chek the Id ");
        }
    }
    @Override
    public PaymentDTO searchPayment(String payment){
        if (repo.existsById(payment)) {
            return mapper.map(repo.findById(payment).get(), PaymentDTO.class);
        } else {
            throw new RuntimeException("No payment for "+payment);
        }
    }
    @Override
    public List<PaymentDTO> getAllPayment(){
        List<Payment>all= repo.findAll();

        return mapper.map(all, new TypeToken<List<Payment>>() {
        }.getType());

    }
}
