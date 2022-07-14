package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Insurance;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.repo.InsuranceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InsuranceServiceImpl {
    @Autowired
    private InsuranceRepo repo;

    public void saveInsurance(Insurance entity){
        if (!repo.existsById(entity.getInsurance_id())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Insurance Already Exits..!");
        }
    }
    public void deleteInsurance(String id){repo.deleteById(id);}
    public void updateInsurance(Insurance entity){repo.save(entity);}
    public Insurance searchInsurance(String id){return repo.findById(id).get();}
    public List<Insurance> getAllInsurance(){return repo.findAll();}
}
